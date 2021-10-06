import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ViewWorkoutsComponent } from './view-workouts/view-workouts.component';
import { AddWorkoutComponent } from './add-workout/add-workout.component';
import { HttpClientModule } from '@angular/common/http';
import { SearchPipe } from './search.pipe';
import { LightswitchComponent } from './components/lightswitch.component';
import { WelcomeComponent } from './components/welcome.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
// import {NgbdToastInline} from '@ng-bootstrap/ng-bootstrap';
@NgModule({
  declarations: [
    AppComponent,
    ViewWorkoutsComponent,
    AddWorkoutComponent,
    SearchPipe,
    LightswitchComponent,
    WelcomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
