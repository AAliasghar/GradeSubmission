import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from '../common/student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private baseURL = "http://localhost:8090/student/all";

  constructor(private httpClient: HttpClient) { }

  getStudentsList(): Observable<Student[]> {
    return this.httpClient.get<Student[]>(`${this.baseURL}`);
  }


  // Get Student By Id
  getStudentById(id: number): Observable<Student> {
    return this.httpClient.get<Student>(`${this.baseURL}/${id}`)
  }



  // Update Employee By Id
  updateStudentById(id: number, student: Student): Observable<Object> {
    return this.httpClient.put(`${this.baseURL}/${id}`, student);
  }
}
