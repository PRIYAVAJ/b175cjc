package com.SpringDATAJPA.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringDATAJPA.model.Student;
import com.SpringDATAJPA.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI {

	
	@Autowired
	StudentRepository sr;
	@Override
	public void saveData(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
		
	}

}
