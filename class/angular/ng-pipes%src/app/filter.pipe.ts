import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(value,x){
    var sa=[];
    for(var i=0;i<value.length;i++){
      if(value[i].indexOf(x)!=-1){
        sa.push(value[i]);
      }
    }
    return sa.sort();
  }

}
