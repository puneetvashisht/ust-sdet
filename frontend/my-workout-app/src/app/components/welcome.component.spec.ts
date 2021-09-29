import { TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { WelcomeComponent } from './welcome.component';

describe('WelcomeComponent', () => {
  beforeEach(async () => {
    // simulating actual component creation
    await TestBed.configureTestingModule({
      declarations: [
        WelcomeComponent
      ],
    }).compileComponents();
  });

  it('should create the app', () => {
    const fixture = TestBed.createComponent(WelcomeComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });
  it('should not have welcome message after construction', () => {
    const fixture = TestBed.createComponent(WelcomeComponent);
    const comp = fixture.componentInstance;
    expect(comp.welcome).toBe('');
  });

  // it('should welcome logged in user after Angular calls ngOnInit', () => {
  //   const fixture = TestBed.createComponent(WelcomeComponent);
  //   const comp = fixture.componentInstance;
  //   comp.ngOnInit();
  //   expect(comp.welcome).toContain(userService.user.name);
  // });

});
