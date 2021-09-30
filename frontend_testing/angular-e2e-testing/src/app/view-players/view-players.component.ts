import { Component, OnInit, ViewChild } from '@angular/core';

@Component({
  selector: 'app-view-players',
  templateUrl: './view-players.component.html',
  styleUrls: ['./view-players.component.scss']
})
export class ViewPlayersComponent implements OnInit {
   players = [];
   indexToDelete:number;
   showModal = false;
   @ViewChild('closebtn') closebutton;
  constructor() { }

  ngOnInit(): void {
    this.players = [
    {"name":'RONALDO','age':'36','club':'JUVENTUS','country':'PORTUGAL'},
    {"name":'MODRIC','age':'36','club':'REAL MADRID','country':'CROITIE'},
    {"name":'RAMOS','age':'35','club':'REAL MADRID','country':'SPAIN'},
    {"name":'MESSI','age':'35','club':'BARCELONE','country':'ARGENTINE'} 
  ]
  }
  addPlayer(event){
    this.players.push(event)
  }
  delete(){
    console.log(this.indexToDelete);
    this.players.splice(this.indexToDelete + 1,1);
    this.closebutton.nativeElement.click();
  }
}
