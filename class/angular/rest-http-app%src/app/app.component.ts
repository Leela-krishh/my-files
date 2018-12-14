import { Component } from '@angular/core';
import { Http, Headers } from '@angular/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'rest-http-app';

  constructor(private http: Http){}

  product_info;
  status;

  getAllProducts(){
    this.http.get("http://localhost:3000/products")
    .subscribe((data)=>this.product_info=data.json());
  }

  addProduct(){
    var product=JSON.stringify({name:'android',model:'g2',price:12999})
    var header=new Headers({'Content-Type':'application/json'})
    this.http.post("http://localhost:3000/products", product, {headers: header})
    .subscribe(()=>this.status="product has been added successfully");
  }

  updateProduct(){
    var product=JSON.stringify({name:'one plus',model:'6s',price:24999})
    var header=new Headers({'Content-Type':'application/json'})
    this.http.put("http://localhost:3000/products/2", product, {headers: header})
    .subscribe(()=>this.status="product has been updated");
  }
  
  deleteProduct(){
    this.http.delete("http://localhost:3000/products/1")
    .subscribe(()=>this.status="product has been deleted");
  }
}
