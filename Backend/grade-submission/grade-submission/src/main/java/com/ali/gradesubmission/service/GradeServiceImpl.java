package com.ali.gradesubmission.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ali.gradesubmission.entity.Course;
import com.ali.gradesubmission.entity.Grade;
import com.ali.gradesubmission.entity.Student;
import com.ali.gradesubmission.exception.GradeNotFoundException;
import com.ali.gradesubmission.repository.CourseRepository;
import com.ali.gradesubmission.repository.GradeRepository;
import com.ali.gradesubmission.repository.StudentRepository;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    GradeRepository gradeRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CourseRepository courseRepository;

    @Override
    public Grade getGrade(Long studentId, Long courseId) {
        Optional<Grade> grade = gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
        // if (grade.isPresent()) {
        // return grade.get();
        // } else {
        // throw new GradeNotFoundException(studentId, courseId);
        // }

        return unwrapGrade(grade, studentId, courseId);
    }

    @Override
    public Grade saveGrade(Grade grade, Long studentId, Long courseId) {
        // Student student = studentRepository.findById(studentId).get();
        Student student = StudentServiceImpl.unwrapStudent(studentRepository.findById(studentId), studentId);
        grade.setStudent(student);
        // Course course = courseRepository.findById(courseId).get();
        Course course = CourseServiceImpl.unwrapCourse(courseRepository.findById(courseId), courseId);
        grade.setCourse(course);
        return gradeRepository.save(grade);
    }

    

    @Override
    public Grade updateGrade(String score, Long studentId, Long courseId) {
        Optional<Grade> grade = gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
        if (grade.isPresent()) {
            Grade unWrappedGrade = grade.get();
            unWrappedGrade.setScore(score);
            return gradeRepository.save(unWrappedGrade);
        } else {
            throw new GradeNotFoundException(studentId, courseId);
        }
        // Could be done this way ***
        // Grade unwrappedGrade = unwrapGrade(grade, studentId, courseId);
        // unwrappedGrade.setScore(score);
        // return gradeRepository.save(unwrappedGrade);

    }

    @Override
    public void deleteGrade(Long studentId, Long courseId) {
        gradeRepository.deleteByStudentIdAndCourseId(studentId, courseId);
    }

    @Override
    public List<Grade> getStudentGrades(Long studentId) {
        return gradeRepository.findByStudentId(studentId);
    }

    @Override
    public List<Grade> getCourseGrades(Long courseId) {
        return gradeRepository.findByCourseId(courseId);
    }

    @Override
    public List<Grade> getAllGrades() {
        return (List<Grade>) gradeRepository.findAll();
    }

    static Grade unwrapGrade(Optional<Grade> entity, Long studentId, Long courseId) {
        if (entity.isPresent())
            return entity.get();
        else
            throw new GradeNotFoundException(studentId, courseId);
    }

}
