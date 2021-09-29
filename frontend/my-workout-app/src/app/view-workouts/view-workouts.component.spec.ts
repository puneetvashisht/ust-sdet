import { ComponentFixture, TestBed } from '@angular/core/testing';
import { SearchPipe } from '../search.pipe';
import { WorkoutService } from '../workout.service';

import { ViewWorkoutsComponent } from './view-workouts.component';
class MockUserService {
    isLoggedIn = true;
    user = { name: 'Ravi'};
  }
describe('ViewWorkoutsComponent', () => {
  let component: ViewWorkoutsComponent;
  let fixture: ComponentFixture<ViewWorkoutsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewWorkoutsComponent, SearchPipe ],
      providers: [
        ViewWorkoutsComponent,
        { provide: WorkoutService, useClass: MockUserService }
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
});
