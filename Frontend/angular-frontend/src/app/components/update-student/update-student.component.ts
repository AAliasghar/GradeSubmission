import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Student } from 'src/app/common/student';
import { StudentService } from 'src/app/services/student.service';

@Component({
  selector: 'app-update-student',
  templateUrl: './update-student.component.html',
  styleUrls: ['./update-student.component.css']
})
export class UpdateStudentComponent implements OnInit {
  id!: number;
  student: Student = new Student();

  constructor(private studentService: StudentService, private router: Router, private route: ActivatedRoute ){

  }

  ngOnInit(): void {
    // Active route
    this.id = this.route.snapshot.params[`id`];

     // Calling getEmployeeById
    this.studentService.getStudentById(this.id).subscribe(data => {
      this.student = data;
    },
      error => console.log(error));
  }


//OnSubmit

OnSubmit(){
  this.studentService.updateStudentById(this.id, this.student).subscribe(data => {
    this.goToStudentList();
  }, error => console.log(error));


  }

goToStudentList() {
  this.router.navigate(['/student/all']);
}

}
