<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  
String msg= request.getParameter("emsg");
if(msg==null){
	msg="";
}
%>

<b style="color:red"><%=msg%></b>

<form action="registration" method="post">
<input type="text" name="user" placeholder="enter username here" required/><br>
<input type="password" name="pass" placeholder="enter password here" required/><br>
<input type="text" name="email" placeholder="enter email here"/><br>
<input type="number" name="number" placeholder="enter mobile number" required/><br>
<button type="register">register</button>
</form>
</body>
</html>