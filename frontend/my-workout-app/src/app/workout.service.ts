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
    return this.http.get( 'http://localhost:8080/workouts');
  }
  deleteWorkout(id: number){
    return this.http.delete( environment.baseUrl + id)
  }

  startEndWorkout(id: number, obj: any){
    return this.http.patch( environment.baseUrl + id, obj)
  }

  addWorkout(workout: any){
    return this.http.post('http://localhost:8080/workouts', workout)
  }

}
