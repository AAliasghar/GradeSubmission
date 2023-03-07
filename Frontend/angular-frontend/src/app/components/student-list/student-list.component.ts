import { Component, OnInit } from '@angular/core';
import { Student } from 'src/app/common/student';
import { StudentService } from 'src/app/services/student.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  students: Student[]=[];

  constructor(private serviceStudent: StudentService){}

  ngOnInit(): void {
    this.getStudents();
  }

  private getStudents(){

    this.serviceStudent.getStudentsList().subscribe(data => {
      this.students = data;
    });
  }

}
