import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class WorkoutService {



  
  constructor(private http: HttpClient) { }

  fetchAllWorkouts(){
    // return this.http.get( environment.baseUrl);
    return this.http.get( 'http://localhost:8080/workouts/');
  }
  deleteWorkout(id: number){
    return this.http.delete( 'http://localhost:8080/workouts/' + id)
  }

  startEndWorkout(id: number, obj: any){
    return this.http.patch( 'http://localhost:8080/workouts/' + id, obj)
  }

  addWorkout(workout: any){
    return this.http.post('http://localhost:8080/workouts/', { observe: 'response' }, workout)
  }

}
