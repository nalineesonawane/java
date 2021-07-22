package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.Service.HomeService;
import com.cjc.main.model.RegisterPage;

@Controller
public class HomeController 
	{
	
	@Autowired
	HomeService hs;
	
	
	@RequestMapping("/")
	public String m1()
	{
		return "login";
	}
	
	@RequestMapping("/log")
	public String loginCheck(@RequestParam("username") String username,@RequestParam("password")String password,Model m)
	{
		List<RegisterPage>slist=hs.loginCheck(username, password);m.addAttribute("data",slist);
	return "success";	
	}
	@RequestMapping("/reg1")
	public String preRegister(@ModelAttribute("registerpage")RegisterPage rp)
	{
		hs.saveData(rp);
		return "login";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @RequestMapping("/reg1") public String m2(@ModelAttribute("regi")
	 * RegisterPage rp) { System.out.println(rp.getName());
	 * System.out.println(rp.getAddress()); System.out.println(rp.getUsername());
	 * System.out.println(rp.getPassword()); System.out.println(rp.getAge());
	 * System.out.println(rp.getMobileno()); return "login"; }
	 * 
	 * @RequestMapping("/log") public String m3(@RequestParam("username") String
	 * username,@RequestParam("password")String password,Model m,ModelMap m1) {
	 * 
	 * System.out.println(username); System.out.println(password);
	 * m.addAttribute("data",username).addAttribute("data1",password);
	 * m1.addAttribute("username",username).addAttribute("password",password);
	 * 
	 * return "success"; }
	 */
}
