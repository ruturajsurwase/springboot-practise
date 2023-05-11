package com.cjc.webapp.crud.main.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.DefaultCrudMethods;
import org.springframework.stereotype.Repository;

import com.cjc.webapp.crud.main.model.Student;


@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>
{

	

	
}
