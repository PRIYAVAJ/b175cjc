package com.SpringDATAJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringDATAJPA.Service.StudentServiceI;
import com.SpringDATAJPA.model.Student;

public class HomeController
{
	@Autowired
	StudentServiceI ssi;
	
	
	
	@RequestMapping("/")
	public String prelogin()
	{
		System.out.println("in login");
		return "login";
	}
	
	@RequestMapping("/log")
	public String preregister()
	{
		return "register";
	}
	@RequestMapping("/save")
	public String saveData(@ModelAttribute Student s,Model m)
	{
		ssi.saveData(s);
		return "login";
	}
}
