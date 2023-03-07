import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GradeListComponent } from './components/grade-list/grade-list.component';
import { StudentListComponent } from './components/student-list/student-list.component';

const routes: Routes = [
  {path:'grade/all', component:GradeListComponent},
  {path:'student/all', component: StudentListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
