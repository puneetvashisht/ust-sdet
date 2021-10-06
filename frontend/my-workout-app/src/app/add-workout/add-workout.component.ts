import { Component, OnInit } from '@angular/core';
import { WorkoutService } from '../workout.service';
import  {map} from 'rxjs/operators';
@Component({
  selector: 'app-add-workout',
  templateUrl: './add-workout.component.html',
  styleUrls: ['./add-workout.component.css']
})
export class AddWorkoutComponent {

  show = false;

  constructor( private workoutService: WorkoutService) { }

  
  addWorkout(title: string, desc: string, cbpm: string){

    this.workoutService.addWorkout({title,desc,cbpm})
    // .pipe(map((data:any) => {
    //   // return data.httpStatus
    //   console.log(data)
    //     }))
    .subscribe((res: any) => {
      console.log(res);
      // this.courses = res;
      this.show = true;
      // if(http status == 201){
      //   show the message
      // }

    });
  }

}
