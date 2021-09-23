import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Course } from '../Course';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  // baseUrl: string = environment.baseUrl

  constructor(private http: HttpClient) { }

  fetchAllCourses(){
    return this.http.get( environment.baseUrl);
  }
  deleteCourse(id: number){
    return this.http.delete( environment.baseUrl + id)
  }

  addCourse(course: any){
    return this.http.post( environment.baseUrl, course)
  }

  updateCourse(id: string|null, course: any){
    return this.http.patch( environment.baseUrl + id, course)
  }

}
