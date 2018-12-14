import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  getAllProducts(){
    return [
      {id:1, name:'Android', model:'one power', price:15999},
    {id:2, name:'motorola', model:'one power', price:15999},
    {id:3, name:'oppo', model:'one power', price:15999},
    {id:4, name:'redmi', model:'one power', price:15999},
    {id:5, name:'one+', model:'one power', price:15999},
    {id:6, name:'samsung', model:'one power', price:15999},
    {id:7, name:'vivo', model:'one power', price:15999},
    {id:8, name:'honor', model:'one power', price:15999},
    {id:9, name:'realme', model:'one power', price:15999},
    {id:10, name:'micromax', model:'one power', price:15999},
    {id:11, name:'pixel', model:'one power', price:15999},
    {id:12, name:'nokia', model:'one power', price:15999},
    {id:13, name:'infinix', model:'one power', price:15999},
    {id:14, name:'infinix', model:'one power', price:15999}
    ];
  }
  constructor() { }
}
