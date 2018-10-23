package jdbc;

import java.sql.*;
public class jdbc {
public static void main(String a[])
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
String url = "jdbc:oracle:thin:@localhost:1521:XE";
Connection conn = DriverManager.getConnection (url, "system", "Capgemini123");
System.out.println("connected");
Statement st=conn.createStatement();
ResultSet rs=st.executeQuery("SELECT empno FROM emp where empno>7800");
while(rs.next()){
System.out.println("Emo No = "+rs.getInt("empno"));
//System.out.println("Emo Name = "+rs.getString("ename"));
}
}
catch(Exception e)
{
 
}
}
 
}