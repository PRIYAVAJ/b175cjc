package com.SpringDATAJPA.serviceI;

import java.util.List;

import com.SpringDATAJPA.model.Student;

public interface StudentServiceI
{

	void saveData(Student s);

	List<Student> loginStudent(String username, String password);
	
	List<Student> deleteStudent(String name);

	public Student editStudent(int rollno);
   

	List<Student> updateStudent(Student s);
	public List<Student> pageing(int pageNo,int size);

	List<Student> paging(int pageNo, int i);



}
