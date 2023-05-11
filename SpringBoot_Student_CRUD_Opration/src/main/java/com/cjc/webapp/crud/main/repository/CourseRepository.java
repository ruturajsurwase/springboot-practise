package com.cjc.webapp.crud.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.webapp.crud.main.model.Course;
;

@Repository
public interface CourseRepository extends CrudRepository<Course,Integer>
{

	public Course findAllByCid(int cid);

}
