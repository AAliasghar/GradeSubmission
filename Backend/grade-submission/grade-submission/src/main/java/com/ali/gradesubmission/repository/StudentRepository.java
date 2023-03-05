package com.ali.gradesubmission.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ali.gradesubmission.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}