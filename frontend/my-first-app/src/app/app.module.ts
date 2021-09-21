import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AlertComponent } from './alert.component';
import {HttpClientModule} from '@angular/common/http';

import { ViewUniversitiesComponent } from './view-universities/view-universities.component';

@NgModule({
  declarations: [
    ViewUniversitiesComponent
    // AppComponent, BadgeComponent, CardComponent, TableComponent, AlertComponent, ViewUniversitiesComponent
  ],
  imports: [
    BrowserModule, HttpClientModule
  ],
  providers: [],
  bootstrap: [ViewUniversitiesComponent]
})
export class AppModule { }
