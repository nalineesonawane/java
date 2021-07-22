package com.cjc.main.Service;

import java.util.List;

import com.cjc.main.model.RegisterPage;

public interface HomeService {

	public int saveData(RegisterPage rp);
	public List<RegisterPage> loginCheck(String username,String password);
}
