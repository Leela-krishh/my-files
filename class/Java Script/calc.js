function doSum()
{
	var x=document.getElementById("fv").value;
	var y=document.getElementById("sv").value;
	var res=parseInt(x)+parseInt(y);
	document.write("sum is:" +res);
}
function doSub()
{
	var x=document.getElementById("fv").value;
	var y=document.getElementById("sv").value;
	var res=parseInt(x)-parseInt(y);
	document.write("sum is:" +res);
}