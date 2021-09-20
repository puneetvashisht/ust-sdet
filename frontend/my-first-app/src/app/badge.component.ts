
// @Component

import { Component, Input } from "@angular/core";

// class 
@Component({
    selector: 'my-badge',
    template: `
    <button type="button" (click)="incrementCount()" class="btn btn-primary">
        {{caption}} <span class="badge bg-secondary">{{count}}</span>
    </button>`
})
export class BadgeComponent extends Component{

    @Input('caption') caption: string = "Default"
    count: number = 0;

    incrementCount(){
        console.log('click event... ')
        this.count++;
    }

}

// export