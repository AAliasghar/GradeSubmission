import { Component, OnInit } from '@angular/core';
import { Grade } from 'src/app/common/grade';
import { GradeService } from 'src/app/services/grade.service';

@Component({
  selector: 'app-grade-list',
  templateUrl: './grade-list.component.html',
  styleUrls: ['./grade-list.component.css']
})
export class GradeListComponent implements OnInit {
  
  constructor( private gradeService: GradeService ){}

  grades: Grade[] = [];
  

  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  private getGrades() {

    this.gradeService.getGradesList().subscribe(data => {
      this.grades = data;
    });
  }

  

}
