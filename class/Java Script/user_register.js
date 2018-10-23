function validate()
{
//username
	var user=document.getElementById('user').value;
	var reg1=/^[a-zA-Z0-9]{4,9}$/;
	if(user.match(reg1)){
		document.getElementById('uerror').innerHTML="";//alert('valid');
		}
	else{
		document.getElementById('uerror').innerHTML="<b style='color:red'>invalid username</b>";
		}
//email		
	var email=document.getElementById('email').value;
	var reg2=/^[a-zA-Z0-9]+[@][0-9a-zA-Z]+[.]+[a-zA-Z]+$/;
	if(email.match(reg2)){
		document.getElementById('eerror').innerHTML="";
		}
	else{
		document.getElementById('eerror').innerHTML="<b style='color:red'>invalid email</b>";
		}
//password		
	var pass=document.getElementById('pass').value;
	var reg3=/^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[_#@]).{8,}$/;
	if(pass.match(reg3)){
		document.getElementById('perror').innerHTML="";
		}
	else{
		document.getElementById('perror').innerHTML="<b style='color:red'>invalid password</b>";
		}
//confirm password		
	var cpass=document.getElementById('cpass').value;
	if(cpass.match(pass)){
		document.getElementById('cperror').innerHTML="";
		}
	else{
		document.getElementById('cperror').innerHTML="<b style='color:red'>password not matched</b>";
		}
//aadhar	
var aadhar=document.getElementById('aadhar').value;
var reg4=/^[3-9][0-9]{11}$/;
if(aadhar.match(reg4)){
	document.getElementById('aerror').innerHTML="";
	}
	else{
	document.getElementById('aerror').innerHTML="<b style='color:red'>invalid aadhar</b>";
	}
//mobile	
	var mobile=document.getElementById('mobile').value;
	var reg4=/^[6-9][0-9]{9}$/;
	if(mobile.match(reg4)){
		document.getElementById('merror').innerHTML="";
		}
		else{
		document.getElementById('merror').innerHTML="<b style='color:red'>invalid mobile</b>";
		}
		return false;
}