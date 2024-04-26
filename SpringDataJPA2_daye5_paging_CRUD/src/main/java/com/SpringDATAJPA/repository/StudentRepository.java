package com.SpringDATAJPA.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringDATAJPA.model.Student;
@Repository
public interface StudentRepository extends JpaRepository <Student,Integer>
{
 public List<Student> findByUsernameAndPassword(String username,String password);
 public List<String> findByName(String name);

 public void deleteByName(String name);
public Optional<Student> findByRollno(int rollno);
}

