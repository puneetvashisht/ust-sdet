import { Component, OnInit } from '@angular/core';
import { Workout } from '../Workout';
import { WorkoutService } from '../workout.service';

@Component({
  selector: 'app-view-workouts',
  templateUrl: './view-workouts.component.html',
  styleUrls: ['./view-workouts.component.css']
})
export class ViewWorkoutsComponent implements OnInit {

  workouts: Array<Workout> = []

  deleteWorkout(id: number){
    this.workoutService.deleteWorkout(id)
    .subscribe((res: any) => {
      console.log(res);
      // this.courses = res;
    });
  }

  startWorkout(id: number){
    this.workoutService.startEndWorkout(id , {startTime: new Date()})
    .subscribe((res: any) => {
      console.log(res);
    });
  }

  endWorkout(id: number){
    this.workoutService.startEndWorkout(id , {endTime: new Date()})
    .subscribe((res: any) => {
      console.log(res);
    });
  }

  constructor( private workoutService: WorkoutService) { }

  ngOnInit(): void {
    console.log('Called once on load of the component');
    //http fetch code here ---
    // this.http.get('http://localhost:3000/courses/')
    this.workoutService.fetchAllWorkouts()
    .subscribe((res: any) => {
      console.log(res);
      this.workouts = res;
    });
  }

}
