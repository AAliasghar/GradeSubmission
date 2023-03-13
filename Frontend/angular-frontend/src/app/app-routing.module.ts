import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CourseListComponent } from './components/course-list/course-list.component';
import { CreateGradeComponent } from './components/create-grade/create-grade.component';
import { GradeListComponent } from './components/grade-list/grade-list.component';
import { StudentListComponent } from './components/student-list/student-list.component';
import { UpdateStudentComponent } from './components/update-student/update-student.component';

const routes: Routes = [
  {path:'grade/all', component:GradeListComponent},
  {path:'create-grade', component:CreateGradeComponent},
  { path: '', redirectTo: 'grade/all', pathMatch: 'full' },
  {path:'student/all', component: StudentListComponent},
  {path:'course/all', component:CourseListComponent},
  { path:'student/all/:id',component:UpdateStudentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
