import { ComponentFixture, TestBed } from '@angular/core/testing';
import { SearchPipe } from '../search.pipe';
import { WorkoutService } from '../workout.service';
import {of} from 'rxjs';


import { ViewWorkoutsComponent } from './view-workouts.component';
import { Workout } from '../Workout';

describe('ViewWorkoutsComponent', () => {
  let component: ViewWorkoutsComponent;
  let fixture: ComponentFixture<ViewWorkoutsComponent>;

  // View Workout components needs a dummy/fake service .. Using fake HttpService
  let service: WorkoutService;
  let httpClientSpy: { get: jasmine.Spy, patch: jasmine.Spy, delete: jasmine.Spy };

  beforeEach(async () => {

    httpClientSpy = jasmine.createSpyObj('HttpClient', ['get', 'patch', 'delete']);
    service = new WorkoutService(httpClientSpy as any);

    await TestBed.configureTestingModule({
      declarations: [ ViewWorkoutsComponent, SearchPipe ],
      providers: [
        ViewWorkoutsComponent,
        { provide: WorkoutService, useValue: service }
      ]
    })
    .compileComponents();

    
   

  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewWorkoutsComponent);
    component = fixture.componentInstance;
    // fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('diff in minutes', () => {
    let result = component.diff_minutes(new Date(1776, 6, 4, 12, 30, 0, 0), new Date(1776, 6, 4, 12, 31, 0, 0))
    console.log(result)
    expect(result).toBe(1);
    
  });


  it('fetch all workouts', () => {
    const workouts: Workout[] = [{
      "id": 1,
      "title": "Running",
      "desc": "overall fitness",
      "cbpm": 23,
      "startTime": "2021-09-27T05:10:41.156Z",
      "endTime": "2021-09-27T05:12:59.919Z"
    },
    {
      "id": 2,
      "title": "Swim",
      "desc": "overall fitness",
      "cbpm": 23,
      "startTime": "2021-09-27T05:10:41.156Z",
      "endTime": "2021-09-27T05:12:59.919Z"
    }
  ]
   
    httpClientSpy.get.and.returnValue(of(workouts));
    component.ngOnInit();
    expect(httpClientSpy.get.calls.count()).toBe(1, 'one call');

    // If template changes happen
    fixture.detectChanges();

    const workoutElement: HTMLElement = fixture.nativeElement;
    const td= workoutElement.querySelector('.title')!;
    console.log(td)
    expect(td.textContent).toEqual('Running');

    // const therow= workoutElement.querySelector('.table');
    // console.log(therow)

    const tdCals= workoutElement.querySelector('.totalcals')!;
    console.log(tdCals)
   
    expect(tdCals.textContent).toBe('46');

    
  });


  it('start a workouts', () => {
    let workout = {
      "id": 1,
      "title": "Running",
      "desc": "overall fitness",
      "cbpm": 23,
      "startTime": "2021-09-27T05:10:41.156Z"
    };
    httpClientSpy.patch.and.returnValue(of(workout));

    let id: number = 1;
    component.startWorkout(1)
    expect(httpClientSpy.patch.calls.count()).toBe(1, 'one call');
  })


  it('delete a workouts', () => {
    let workout = {
    };
    httpClientSpy.delete.and.returnValue(of(workout));

    let id: number = 1;
    component.deleteWorkout(id)
    expect(httpClientSpy.delete.calls.count()).toBe(1, 'one call');
    expect(component.workouts.length).toBe(0);
  })


});
