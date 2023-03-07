import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Course } from '../common/course';

@Injectable({
  providedIn: 'root'
})
export class CourseService{

  private baseURL = "http://localhost:8090/course/all";

  constructor(private httpClient: HttpClient) { }


  getCourseList(): Observable<Course[]>{

    return this.httpClient.get<Course[]>(`${this.baseURL}`);
  }

 

}
