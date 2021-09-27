import { Component, OnInit } from '@angular/core';
import { WorkoutService } from '../workout.service';

@Component({
  selector: 'app-add-workout',
  templateUrl: './add-workout.component.html',
  styleUrls: ['./add-workout.component.css']
})
export class AddWorkoutComponent {

  constructor( private workoutService: WorkoutService) { }

  
  addWorkout(title: string, desc: string, cbpm: string){

    this.workoutService.addWorkout({title,desc,cbpm})
    .subscribe((res: any) => {
      console.log(res);
      // this.courses = res;
    });
  }

}
