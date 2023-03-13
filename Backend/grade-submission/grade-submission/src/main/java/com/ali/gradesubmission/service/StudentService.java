package com.ali.gradesubmission.service;

import java.util.List;

import com.ali.gradesubmission.entity.Student;

public interface StudentService {
    Student getStudent(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
   // Student updateStudent(Long id);
    List<Student> getStudents();
}