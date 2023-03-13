import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Grade } from 'src/app/common/grade';
import { GradeService } from 'src/app/services/grade.service';

@Component({
  selector: 'app-create-grade',
  templateUrl: './create-grade.component.html',
  styleUrls: ['./create-grade.component.css']
})
export class CreateGradeComponent implements OnInit {

  grade: Grade = new Grade();

  constructor(private gradeService: GradeService, private router: Router) { }

  ngOnInit(): void {

  }

  saveGrade() {
    this.gradeService.addGrade(this.grade).subscribe(data => {
      console.log(data);
      this.gotToGradeList;
    },
      error => console.log(error));
  }

  gotToGradeList() {
    this.router.navigate(['/grade/all']);
  }

  OnSubmit() {
    console.log(this.grade);
    //this.saveGrade();
    this.gotToGradeList();
  }

}
