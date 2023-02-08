package com.ali.gradesubmission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ali.gradesubmission.entity.Student;
import com.ali.gradesubmission.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired StudentRepository studentRepository;


    @Override
    public Student getStudent(Long id) {
        return null;
    }

    @Override
    public Student saveStudent(Student student) {
        return  studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {        
    }

    @Override
    public List<Student> getStudents() {
        return null;
    }


}