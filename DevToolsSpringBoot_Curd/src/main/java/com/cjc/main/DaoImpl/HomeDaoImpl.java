package com.cjc.main.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cjc.main.Dao.HomeDao;
import com.cjc.main.model.RegisterPage;

@Repository
public class HomeDaoImpl implements HomeDao
{
	
	@Autowired
		SessionFactory sf;
	@Override
		public int saveData(RegisterPage rp)

	{
		Session s=sf.openSession();
		int id=(Integer)s.save(rp);
		s.beginTransaction().commit();
		return id;
	}
	@Override
	public List<RegisterPage> loginCheck(String username, String password) {
		Session s=sf.openSession();

		if(username.equals("root")&&password.equals("root"))
		{

			Query q=s.createQuery("From RegistePage");
			List<RegisterPage> slist=q.getResultList();
			return slist;
		}
		else
		{
			Query q=s.createQuery("From RegisterPage where username=:username and password=:password");
			q.setParameter("username", username);
			q.setParameter("password", password);
			List<RegisterPage> slist=q.getResultList();
			return slist;

			
			
			
			
	}

}
}
