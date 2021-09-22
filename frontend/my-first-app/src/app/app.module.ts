import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AlertComponent } from './alert.component';
import {HttpClientModule} from '@angular/common/http';

import { ViewUniversitiesComponent } from './view-universities/view-universities.component';
import { ViewCoursesComponent } from './view-courses/view-courses.component';
import { AddCourseComponent } from './add-course/add-course.component';

@NgModule({
  declarations: [
    // ViewUniversitiesComponent,
    ViewCoursesComponent,
    AddCourseComponent
    // AppComponent, BadgeComponent, CardComponent, TableComponent, AlertComponent, ViewUniversitiesComponent
  ],
  imports: [
    BrowserModule, HttpClientModule
  ],
  providers: [],
  bootstrap: [ViewCoursesComponent]
})
export class AppModule { }
