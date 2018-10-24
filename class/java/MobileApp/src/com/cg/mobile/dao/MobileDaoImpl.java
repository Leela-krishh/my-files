package com.cg.mobile.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.cg.mobile.bean.Mobile;

public class MobileDaoImpl implements IMobileDao {

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "demo for mobile app";
	}

	@Override
	public List<Mobile> getMobileByPrice(double price) {
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			String user="system";
			String pass="Capgemini123";
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="select *from mobiles where price>=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setDouble(1, price);
			ResultSet rs=ps.executeQuery();
			Mobile m=null;
			List<Mobile> list=new ArrayList<>();
			while(rs.next()){
				m=new Mobile();
				m.setMobileId(rs.getInt(1));
				m.setNeme(rs.getString(2));
				m.setPrice(rs.getDouble(3));
				m.setQuantity(rs.getString(4));
				list.add(m);
			}
			return list;
		}
		catch(Exception e){}
		return null;
	}

	@Override
	public List<Mobile> getAllMobiles() {
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			String user="system";
			String pass="Capgemini123";
			Connection con=DriverManager.getConnection(url,user,pass);
			String sql="select *from mobiles";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			Mobile m=null;
			List<Mobile> list1=new ArrayList<>();
			while(rs.next()){
				m=new Mobile();
				m.setMobileId(rs.getInt(1));
				m.setNeme(rs.getString(2));
				m.setPrice(rs.getDouble(3));
				m.setQuantity(rs.getString(4));
				list1.add(m);
			}
			return list1;
		}
		catch(Exception e){}
		return null;
	}

}
