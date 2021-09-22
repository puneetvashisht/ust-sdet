import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-add-course',
  templateUrl: './add-course.component.html',
  styleUrls: ['./add-course.component.css']
})
export class AddCourseComponent implements OnInit {

  constructor(private http: HttpClient) { }


  addCourse(title: string, author: string){
    this.http.post('http://localhost:3000/courses/', {title, author})
    .subscribe((res: any) => {
      console.log(res);
      // this.courses = res;
    });
  }

  ngOnInit(): void {
  }

}
