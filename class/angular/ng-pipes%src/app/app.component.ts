import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ng-pipes-app';
  languages=['java','pega','react','angular','node']

  products=[
    {id:1, name:'Android', model:'one power', price:15999},
    {id:2, name:'moto', model:'g5s+', price:12999},
    {id:3, name:'redmi', model:'note 6 pro', price:10999},
    {id:4, name:'one+', model:'6 pro', price:25999},
  ]
}
