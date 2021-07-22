package com.cjc.main.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Dao.HomeDao;
import com.cjc.main.Service.HomeService;
import com.cjc.main.model.RegisterPage;
@Service
public class HomeServiceImpl implements HomeService {
	@Autowired
	HomeDao hd;
	@Override
	public int saveData(RegisterPage rp)
	{
		return hd.saveData(rp);
	}

@Override
public List<RegisterPage> loginCheck(String username,String password)
{
	return hd.loginCheck(username, password);
}
}