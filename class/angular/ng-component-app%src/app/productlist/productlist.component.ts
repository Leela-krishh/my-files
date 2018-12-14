import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent implements OnInit {

  products=[
    {id:1, name:'moto', model:'one power', price:15999, votes:8},
    {id:2, name:'motorola', model:'g2', price:12999, votes:5},
    {id:3, name:'samsung', model:'c200', price:1300, votes:2}
  ]
  product;

  selectedProduct(p){
    this.product=p;
  }
  constructor() { }

  ngOnInit() {
  }

}
