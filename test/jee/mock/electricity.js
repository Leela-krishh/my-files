function calculate()
{
//number
    var num=document.getElementById('num').value;
    var reg1=/^[1-9][0-9]{7}$/;
    if(num.match(reg1)){
        document.getElementById('nerror').innerHTML="";
    }
    else{
        document.getElementById('nerror').innerHTML="<b><i>*give a valid number</i></b>";
    }
//name
    var name=document.getElementById('name').value;
    var reg2=/^[A-Z][a-zA-Z0-9].{3,}$/;
    if(name.match(reg2)){
        document.getElementById('merror').innerHTML="";
    }
    else{
        document.getElementById('merror').innerHTML="<b><i>*name is invalid</i></b>";
    }
//email		
var email=document.getElementById('email').value;
var reg2=/^[a-zA-Z0-9]+[@][0-9a-zA-Z]+[.]+[a-zA-Z]+$/;
if(email.match(reg2)){
    document.getElementById('eerror').innerHTML="";
    }
else{
    document.getElementById('eerror').innerHTML="<b><i>*invalid email</i></b>";
    }
//unit
    var unit=document.getElementById('unit').value;
    var reg2=/^[0-9]$/;
    if(unit.match(reg2)){
        document.getElementById('uerror').innerHTML="";
        }
    else{
        document.getElementById('uerror').innerHTML="<b><i>*correct unit is required</i></b>";
        }
    alter(num+' '+name+' '+email+' '+unit);
        return false;
}