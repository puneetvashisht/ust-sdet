import { Component, Input, OnInit } from '@angular/core';
import { Course } from '../Course';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {

  @Input('courses') courses: Array<Course>  = []
  constructor() { }

  ngOnInit(): void {
  }

}
