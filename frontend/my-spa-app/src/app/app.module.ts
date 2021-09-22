import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router'; 

import { AppComponent } from './app.component';
import { AddCourseComponent } from './components/add-course/add-course.component';
import { ViewCoursesComponent } from './components/view-courses/view-courses.component';

const routes: Routes = [
  {path: 'add', component: AddCourseComponent},
  {path: '', pathMatch: 'full' ,  component: ViewCoursesComponent},
];

@NgModule({
  declarations: [
    AppComponent, ViewCoursesComponent, AddCourseComponent
  ],
  imports: [
    BrowserModule,RouterModule.forRoot(routes), HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
