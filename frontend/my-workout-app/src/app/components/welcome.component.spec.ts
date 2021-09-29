import { Component } from '@angular/core';
import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { UserService } from '../services/user.service';
import { WelcomeComponent } from './welcome.component';

class MockUserService {
  isLoggedIn = true;
  user = { name: 'Ravi'};
}


describe('WelcomeComponent', () => {

  let userService: UserService;
  let fixture: ComponentFixture<WelcomeComponent>;
  let comp: WelcomeComponent;
  beforeEach(async () => {
    // simulating actual component creation
    await TestBed.configureTestingModule({
      declarations: [
        WelcomeComponent
      ],
      providers: [
        WelcomeComponent,
        { provide: UserService, useClass: MockUserService }
      ]
    }).compileComponents();
    userService = TestBed.inject(UserService);
    fixture = TestBed.createComponent(WelcomeComponent);
    comp = fixture.componentInstance;
    // fixture.detectChanges();
  });

  it('should create the app', () => { 
    expect(comp).toBeTruthy();
  });
  
  it('should not have welcome message after construction', () => {
    expect(comp.welcome).toBe('');
  });

  it('should welcome logged in user after Angular calls ngOnInit', () => {
    comp.ngOnInit();
    expect(comp.welcome).toContain('Welcome, Ravi');
  });

  it('should welcome logged in user after Angular calls ngOnInit', () => {
    comp.ngOnInit();
    expect(comp.welcome).toContain(userService.user.name);
  });

  it('should ask user to log in if not logged in after ngOnInit', () => {
    userService.isLoggedIn = false;
    comp.ngOnInit();
    expect(comp.welcome).not.toContain(userService.user.name);
    expect(comp.welcome).toContain('log in');
  });

  it('should ask user to log in if not logged in after ngOnInit', () => {
    userService.isLoggedIn = true;
    comp.logout();
    expect(comp.welcome).not.toContain(userService.user.name);
    expect(comp.welcome).toContain('log in');
  });

  it('should have <p> with "Welcome component"', () => {

    userService.isLoggedIn = false;
    comp.ngOnInit();
    fixture.detectChanges();

    const bannerElement: HTMLElement = fixture.nativeElement;
    const p = bannerElement.querySelector('p')!;
    console.log(p)
    expect(p.textContent).toEqual('Please log in.');
  });

  it('should have <p> with "Welcome component"', () => {

    userService.isLoggedIn = true;
    comp.ngOnInit();
    fixture.detectChanges();

    const bannerElement: HTMLElement = fixture.nativeElement;
    const p = bannerElement.querySelector('p')!;
    console.log(p)
    expect(p.textContent).toEqual('Welcome, Ravi');
  });

});
