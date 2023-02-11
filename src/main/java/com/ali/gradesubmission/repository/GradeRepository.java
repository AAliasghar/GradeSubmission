package com.ali.gradesubmission.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ali.gradesubmission.entity.Grade;

@Repository
public interface GradeRepository extends CrudRepository<Grade,Long>{

}