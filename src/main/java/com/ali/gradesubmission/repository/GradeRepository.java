package com.ali.gradesubmission.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ali.gradesubmission.entity.Grade;

@Repository
public interface GradeRepository extends CrudRepository<Grade, Long> {
    Optional<Grade> findByStudentIdAndCourseId(Long studentId, Long courseId); // Custom query by studentId and
                                                                               // courseId, Optional to check Null

    void deleteByStudentIdAndCourseId(Long studentId, Long courseId);
}