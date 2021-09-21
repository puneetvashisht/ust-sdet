import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'app-alert',
    template: `
    
    <div class="alert alert-primary" role="alert">
        A simple primary alert—check it out!
    </div>
    `
})
export class AlertComponent implements OnInit {

    constructor() { }

    ngOnInit() { 

    }

}