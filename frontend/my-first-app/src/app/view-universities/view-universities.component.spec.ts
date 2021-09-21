import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewUniversitiesComponent } from './view-universities.component';

describe('ViewUniversitiesComponent', () => {
  let component: ViewUniversitiesComponent;
  let fixture: ComponentFixture<ViewUniversitiesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewUniversitiesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewUniversitiesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
