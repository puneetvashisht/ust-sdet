import { Component, OnInit } from "@angular/core";
import { UserService } from "../services/user.service";

@Component({
    selector: 'app-welcome',
    template: `<p>{{welcome}}</p>
    `, 
  })
export class WelcomeComponent implements OnInit {
    welcome = '';
    constructor(public userService: UserService) { }
  
    ngOnInit(): void {
      this.welcome = this.userService.isLoggedIn ?
        'Welcome, ' + this.userService.user.name : 'Please log in.';
    }

    logout(){
        this.userService.isLoggedIn = false;
        this.welcome = this.userService.isLoggedIn ?
        'Welcome, ' + this.userService.user.name : 'Please log in.';
    }
  }