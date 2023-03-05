import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Grade } from '../common/grade';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GradeService {


  private baseURL = "http://localhost:8090/grade/all";

  constructor(private httpClient: HttpClient) { }

  getEmployeesList(): Observable<Grade[]> {
    return this.httpClient.get<Grade[]>(`${this.baseURL}`);
  }
}
