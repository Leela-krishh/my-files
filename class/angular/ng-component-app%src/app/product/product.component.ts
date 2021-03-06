import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  @Input() productInfo;
  
  vote(v){
    this.productInfo.votes=v.votes+1;
  }
  constructor() { }

  ngOnInit() {
  }

}
