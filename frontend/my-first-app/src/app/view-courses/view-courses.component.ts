import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { CourseService } from '../course.service';

@Component({
  selector: 'app-root',
  templateUrl: './view-courses.component.html',
  styleUrls: ['./view-courses.component.css']
})
export class ViewCoursesComponent implements OnInit {

  courses: Array<any> = [];

  deleteCourse(id: number){
    this.courseService.deleteCourse(id)
    .subscribe((res: any) => {
      console.log(res);
      // this.courses = res;
    });
  }

  constructor(private http: HttpClient, private courseService: CourseService) { }

  ngOnInit(): void {
    console.log('Called once on load of the component');
    //http fetch code here ---
    // this.http.get('http://localhost:3000/courses/')
    this.courseService.fetchAllCourses()
    .subscribe((res: any) => {
      console.log(res);
      this.courses = res;
    });
  }

}
