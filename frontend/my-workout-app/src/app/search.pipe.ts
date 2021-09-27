import { Pipe, PipeTransform } from '@angular/core';
import { Workout } from './Workout';

@Pipe({
  name: 'searchWorkout'
})
export class SearchPipe implements PipeTransform {

  transform(workouts: Array<Workout>, searchValue: string): Array<Workout> {
    console.log(workouts);
    console.log(searchValue)

    let filteredWorkouts = workouts.filter(workout=> workout.title.toLowerCase().includes(searchValue.toLowerCase()))

    return filteredWorkouts;
  }

}
