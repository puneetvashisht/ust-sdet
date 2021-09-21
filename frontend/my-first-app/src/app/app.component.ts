import { Component } from '@angular/core';
import { Course } from './Course';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-first-app';
  courses: Array<Course>  = [
    {id: 23, title: "Angular", summary: "Angular is cool!!"},
    {id: 2, title: "React", summary: "React is cool too!!"},
    {id: 3, title: "NodeJS", summary: "Server side JS!!"},
    {id: 13, title: "Ember", summary: "Another popular UI framework!!"}
  ]
}
