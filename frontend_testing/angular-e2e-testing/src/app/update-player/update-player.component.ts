import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-update-player',
  templateUrl: './update-player.component.html',
  styleUrls: ['./update-player.component.scss']
})
export class UpdatePlayerComponent implements OnInit, OnChanges {
  @Input()
  player:any;
  showModal = false;
  constructor() { }
  ngOnChanges(changes: SimpleChanges): void {
    if(changes.player){
      this.player = changes.player.currentValue;
      console.log(this.player);
      
    }
  }

  ngOnInit(): void {
    console.log(this.player);
    
  }

}
