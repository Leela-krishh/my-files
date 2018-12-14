import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ng-component-app';
  total=20;
  tickets=0;
  booked(){
    this.total=this.total-this.tickets;
  }
  x=0;
  y=0;
  result;
  add(){
    this.result=this.x+this.y;
  }
  sub(){
    this.result=this.x-this.y;
  }
  element;
  array=[];
  insert(){
    this.array.push(this.element);
  }
  remove(index){
    this.array.splice(index,1);
  }
  Tcities=[
    {n:'adilabad'},{n:'hyderabad'}, {n:'khammam'}, {n:'Nalgonda'}, {n:'mahaboobnagar'}
  ]
  Acities=[
    {n:'kadapa'}, {n:'kurnool'}, {n:'chittor'}, {n:'ananthapur'}, {n:'guntur'}
  ]
  
  isBordered=true;

  setBorder(){
    this.isBordered=!this.isBordered;
  }
  d=Date();
}