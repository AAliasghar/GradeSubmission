package com.ali.gradesubmission.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.ali.gradesubmission.entity.Grade;
import com.ali.gradesubmission.entity.Student;
import com.ali.gradesubmission.exception.StudentNotFoundException;
import com.ali.gradesubmission.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student getStudent(Long id) {
        Optional<Student> student = studentRepository.findById(id);

        // if (student.isPresent()) {
        // return student.get();
        // } else {
        // throw new StudentNotFoundException(id);
        // }

        return unwrapStudent(student, id);

    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    static Student unwrapStudent(Optional<Student> entity, Long id) {
        if (entity.isPresent())
            return entity.get();
        else {
            throw new StudentNotFoundException(id);
        }

    }
}