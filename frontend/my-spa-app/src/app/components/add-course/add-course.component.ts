
import { Component, OnInit } from '@angular/core';
import { CourseService } from '../../services/course.service';

@Component({
  selector: 'app-add-course',
  templateUrl: './add-course.component.html',
  styleUrls: ['./add-course.component.css']
})
export class AddCourseComponent implements OnInit {

  showMessage: boolean = false;

  constructor(private courseService: CourseService) { }


  addCourse(title: string, author: string){
    // this.http.post('http://localhost:3000/courses/', {title, author})
    this.courseService.addCourse({title,author})
    .subscribe((res: any) => {
      console.log(res);
      // this._snackBar.open("Course Added Successfully!!", "Close");
      // this.courses = res;
      this.showMessage = true;
    });
  }

  ngOnInit(): void {
  }

}
