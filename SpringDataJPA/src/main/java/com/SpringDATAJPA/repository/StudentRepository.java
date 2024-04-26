package com.SpringDATAJPA.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringDATAJPA.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>
{

}
