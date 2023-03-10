package com.ali.gradesubmission.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ali.gradesubmission.entity.Student;
import com.ali.gradesubmission.service.StudentService;

@CrossOrigin(origins = "http://localhost:65412")
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired StudentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        return new ResponseEntity<>(studentService.getStudent(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {    // @RequestBody deserialize JSON properties into Student object
        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getStudents() {
        return new ResponseEntity<>(studentService.getStudents(),HttpStatus.OK);
    }

    // Alternative
    // @GetMapping("/all")
    // public List<Student> getStudents() {
    //     return studentService.getStudents();
    // }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudenyById( @PathVariable Long id, @RequestBody Student studentDetails){

        // Getting Student By Id
        Student student = studentService.getStudent(id);
        
        // Updating new details
        student.setName(studentDetails.getName());
        student.setBirthDate(studentDetails.getBirthDate());

        // save student
        Student updatedStudent = studentService.saveStudent(student);
        return ResponseEntity.ok(updatedStudent);

    }
}
