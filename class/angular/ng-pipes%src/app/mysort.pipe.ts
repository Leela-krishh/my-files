import { Pipe, PipeTransform } from '@angular/core';
import { ValueTransformer } from '@angular/compiler/src/util';

@Pipe({
  name: 'mysort'
})
export class MysortPipe implements PipeTransform {

 /*  transform(value,x) {
    if(x=='asc'){
    return value.sort();
    }else if(x=='desc'){
    return value.sort().reverse();
    }else{
    return value;
    }
  } */

  transform(value,x) {
    if(x=='asc'){
      return value.sort((a,b)=>{
        if(a.price > b.price){return 1}
        else if(a.price < b.price){return -1}
        else{return 0}
      })
    }
    else if(x=='desc'){
      return value.sort((a,b)=>{
        if(a.price > b.price){return -1}
        else if(a.price < b.price){return 1}
        else{return 0}
      })
    }
    else{
      return value;
    }
  }
}
