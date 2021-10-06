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
  message: string = ''

  deleteWorkout(id: number) {
    this.workoutService.deleteWorkout(id)
      .subscribe((res: any) => {
        console.log(res);
        // this.courses = res;
        let remainingWorkouts = this.workouts.filter(workout => workout.id != id)
        this.workouts = remainingWorkouts;
        this.message = 'Workout deleted successfully!'

      });
  }

  startWorkout(id: number) {
    this.workoutService.startEndWorkout(id, { startTime: new Date() })
      .subscribe((res: any) => {
        console.log(res);
        this.message = 'Workout started successfully!'
      });
  }

  endWorkout(id: number) {
    this.workoutService.startEndWorkout(id, { endTime: new Date() })
      .subscribe((res: any) => {
        console.log(res);
        this.message = 'Workout ended successfully!'
      });
  }

  constructor(private workoutService: WorkoutService) { }


  diff_minutes(dt2: Date, dt1: Date) {
    var diff = (dt2.getTime() - dt1.getTime()) / 1000;
    diff /= 60;
    return Math.abs(Math.round(diff));
  }


  ngOnInit(): void {
    console.log('Called once on load of the component');
    //http fetch code here ---
    // this.http.get('http://localhost:3000/courses/')
    this.workoutService.fetchAllWorkouts()
      .subscribe((res: any) => {
        console.log(res);
        this.workouts = res;
        
        this.workouts.forEach((workout, i)=> {
          console.log(workout);
          if(workout.startTime && workout.endTime){
            var diffMinutes = this.diff_minutes(new Date(workout.startTime), new Date(workout.endTime))
            console.log(`${workout.title} : ${diffMinutes}`)
            workout.totalCaloriesBurnt = (workout.cbpm * diffMinutes);
          }
        })


      });
  }

}
