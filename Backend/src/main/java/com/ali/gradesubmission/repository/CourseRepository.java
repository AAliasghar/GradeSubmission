package com.ali.gradesubmission.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ali.gradesubmission.entity.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course,Long>{

}