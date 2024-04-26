package com.SpringDATAJPA.serviceI;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SpringDATAJPA.model.Student;
import com.SpringDATAJPA.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI {

	
	@Autowired
	StudentRepository sr;

	public void saveData(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
		
	}
	public List<Student> loginStudent(String username, String password) {
		if(username.equals("admin")&& password.equals("admin")) {
			return(List<Student>)sr.findAll();
		}
		else
		{
			
			return sr.findByUsernameAndPassword(username, password);
		}
		
	}
	@Transactional
	@Modifying
	@Override
	public List<Student> deleteStudent(String name) {
		sr.deleteByName(name);
		return (List<Student>)sr.findAll();
		
	}
	@Transactional
	@Modifying
	@Override
	public Student editStudent(int rollno)
	{
	Optional<Student>op=sr.findByRollno(rollno);
	
		
		if(op.isPresent())
		{
			Student s=op.get();
			return s;
			
		}
		else
		{
			return null;
		}
	}
	@Override
	public List<Student> updateStudent(Student s)
	{ 
		sr.save(s);
		return (List<Student>) sr.findAll();
	}
	@Override
	public List<Student> pageing(int pageNo, int size) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> paging(int pageNo, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
