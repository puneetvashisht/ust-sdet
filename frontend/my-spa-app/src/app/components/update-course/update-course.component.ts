import { Component, OnInit } from '@angular/core';
import {  ActivatedRoute } from '@angular/router';
import { CourseService } from 'src/app/services/course.service';
@Component({
  selector: 'app-update-course',
  templateUrl: './update-course.component.html',
  styleUrls: ['./update-course.component.css']
})
export class UpdateCourseComponent implements OnInit {

  id:string|null = '0';

  constructor(private route: ActivatedRoute, private courseService: CourseService) { }

  ngOnInit(): void {

    const id = this.route.snapshot.paramMap.get('id');
    console.log(id);
    this.id= id;
  }


  updateCourse(title: string){
    // this.http.post('http://localhost:3000/courses/', {title, author})
    this.courseService.updateCourse(this.id, {title})
    .subscribe((res: any) => {
      console.log(res);
      // this.courses = res;
    });
  }

}
