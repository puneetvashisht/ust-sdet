import { Component, EventEmitter, OnInit, Output, ViewChild } from '@angular/core';

@Component({
  selector: 'app-add-player',
  templateUrl: './add-player.component.html',
  styleUrls: ['./add-player.component.scss']
})
export class AddPlayerComponent implements OnInit {
  newPlayer={};
  showModal= false;
  @Output() addPlayer: EventEmitter<any> = new EventEmitter<any>();
  @ViewChild('closebutton') closebutton;

  constructor() { }

  ngOnInit(): void {
    //this.initPlayer();
  }
  initPlayer(){
   this.newPlayer = {"name":'','age':'','club':'','country':''};
   console.log(this.newPlayer);
   
  }
  save(){
    this.addPlayer.emit(this.newPlayer);
    this.closebutton.nativeElement.click();
    this.initPlayer();
  }

}
