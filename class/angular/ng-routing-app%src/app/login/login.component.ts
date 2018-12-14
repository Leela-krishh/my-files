import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Validators, FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
 constructor(private router: Router) { }
  uname;
  pass;
  ngOnInit() {
  }
  users=[
    {n:'leela', p:'123'},
    {n:'krish',p:'456'},
    {n:'sai',p:'789'}
  ]
  login(){
//   for(var i=0;i<this.users.length;i++){
//   if((this.users[i].n==this.uname) && (this.users[i].p=this.password)){
//     return alert('ok');
//   }else{
//     return alert('not correct');
//   }
// }
this.router.navigateByUrl('/home');
  }
}
