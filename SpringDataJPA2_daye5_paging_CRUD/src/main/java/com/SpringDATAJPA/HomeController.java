package com.SpringDATAJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringDATAJPA.model.Student;
import com.SpringDATAJPA.serviceI.StudentServiceI;
@Controller
public class HomeController
{
	@Autowired
	StudentServiceI ssi;
	private Object m;
	
	
	
	@RequestMapping("/")
	public String prelogin()
	{
		System.out.println("in login");
		return "login";
	}
	
	@RequestMapping("/openreg")
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
	@RequestMapping("/log")
	public String loginStudent(@RequestParam  String username,@RequestParam String password,Model m)
	{
	List<Student>list=(List<Student>) ssi.loginStudent(username, password);
	if(!list.isEmpty())
	{
		 m.addAttribute("data",list);
		return "success";
	}
	else
	{
	return "login";
	}
	}
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam String name,Model m)
	{
		List<Student> list=ssi.deleteStudent(name);
		 m.addAttribute("data",list);
		return "success";
	}
	@RequestMapping("/edit")
	public String editStudent(@RequestParam int rollno,Model m)
	{
		Student s=ssi.editStudent(rollno);
		m.addAttribute("stu",s);
		return "edit";
	}
	@RequestMapping("/update")
	public String updateStudent(@ModelAttribute Student s,Model m)
	{    
		List<Student> list=ssi.updateStudent(s);
		 m.addAttribute("data",list);
		
		return "success";
	}
	@RequestMapping("/paging")
	public String paging(@RequestParam int pageNo,Model m)
	{   
		List<Student>list=ssi.paging(pageNo,3);
		m.addAttribute("data",list);
		return "success";
	}
		
}