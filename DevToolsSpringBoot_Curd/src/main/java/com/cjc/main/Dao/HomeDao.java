package com.cjc.main.Dao;

import java.util.List;

import com.cjc.main.model.RegisterPage;

public interface HomeDao {

	public int saveData(RegisterPage rp);
	public List<RegisterPage>loginCheck(String username,String password);
}
