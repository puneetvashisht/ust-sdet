import { TestBed } from '@angular/core/testing';
import { Workout } from './Workout';
import {of} from 'rxjs';

import { WorkoutService } from './workout.service';

describe('WorkoutService', () => {
  let service: WorkoutService;
  let httpClientSpy: { get: jasmine.Spy };


  beforeEach(() => {
    // TestBed.configureTestingModule({});
    // service = TestBed.inject(WorkoutService);

    httpClientSpy = jasmine.createSpyObj('HttpClient', ['get']);
    service = new WorkoutService(httpClientSpy as any);

  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });


  it('should return expected workouts (HttpClient called once)', (done: DoneFn) => {
    const workouts: Workout[] = [{
        "id": 1,
        "title": "Swimming",
        "desc": "overall fitness",
        "cbpm": 23,
        "startTime": "2021-09-27T05:10:41.156Z",
        "endTime": "2021-09-27T05:12:59.919Z"
      },
      {
        "id": 2,
        "title": "Running",
        "desc": "overall fitness",
        "cbpm": 18,
        "startTime": "2021-09-27T05:13:37.372Z",
        "endTime": "2021-09-27T10:09:39.088Z"
      },
      {
        "title": "Backstroke Swimming",
        "desc": "Really good ",
        "cbpm": 23,
        "id": 3,
        "startTime": "2021-09-27T10:11:21.224Z",
        "endTime": "2021-09-27T10:12:45.664Z"
      },
      {
        "title": "Frontfly Swimming",
        "desc": "Really good ",
        "cbpm": 22,
        "id": 4,
        "startTime": "2021-09-27T10:12:54.696Z",
        "endTime": "2021-09-27T10:14:37.716Z"
      }]
     
  
    httpClientSpy.get.and.returnValue(of(workouts));
  
    service.fetchAllWorkouts().subscribe(
      (res: any) => {
        // console.log(res);
        expect(res.length).toBe(4)
        expect(res[0].title).toBe("Swimming");
        done();
      },
      done.fail
    );
    expect(httpClientSpy.get.calls.count()).toBe(1, 'one call');
  });



});
