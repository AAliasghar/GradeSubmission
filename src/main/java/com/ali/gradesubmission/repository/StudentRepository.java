package com.ali.gradesubmission.repository;

import org.springframework.data.repository.CrudRepository;

import com.ali.gradesubmission.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{}