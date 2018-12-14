import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-ng-app';
  message="hello, good morning"
  leela='10'
  lang=['java','react','pega','angular']
  products=[
    { id:1,name:'motorola',model:'one power',price:'15,999'},
    { id:2,name:'redmi',model:'note 6 pro',price:'9,999'},
    { id:3,name:'moto',model:'g5s+',price:'11,999'}
  ]
}
