import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employeelist',
  templateUrl: './employeelist.component.html',
  styleUrls: ['./employeelist.component.css']
})
export class EmployeelistComponent implements OnInit {

  employees=[
    {id:101, name:'leela', role:'Analyst', date_of_joining:'19-sep-2018'},
    {id:102, name:'krishh', role:'Manager', date_of_joining:'14-oct-2017'},
    {id:103, name:'sai', role:'HR', date_of_joining:'29-aug-2014'}
  ]
  employee;

  selectedEmployee(e){
    this.employee=e;
  }
  constructor() { }

  ngOnInit() {
  }

}
