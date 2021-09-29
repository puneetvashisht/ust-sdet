import { ComponentFixture, TestBed } from '@angular/core/testing';
import { WorkoutService } from '../workout.service';

import { AddWorkoutComponent } from './add-workout.component';


class MockUserService {
    isLoggedIn = true;
    user = { name: 'Ravi'};
  }

describe('AddWorkoutComponent', () => {
  let component: AddWorkoutComponent;
  let fixture: ComponentFixture<AddWorkoutComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddWorkoutComponent ],
      providers: [
        AddWorkoutComponent,
        { provide: WorkoutService, useClass: MockUserService }
      ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddWorkoutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
