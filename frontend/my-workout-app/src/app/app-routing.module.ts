import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddWorkoutComponent } from './add-workout/add-workout.component';
import { ViewWorkoutsComponent } from './view-workouts/view-workouts.component';

const routes: Routes = [
  {path: '', component: ViewWorkoutsComponent},
  {path: 'add', component: AddWorkoutComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
