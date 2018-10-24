package com.cg.mobile.ui;

import java.security.Provider.Service;
import java.util.List;
import java.util.Scanner;

import com.cg.mobile.bean.Mobile;
import com.cg.mobile.service.IMobileService;
import com.cg.mobile.service.MobileServiceImpl;

public class MobileUI {

	public static void main(String[] args){
		
		IMobileService service = new MobileServiceImpl();
		System.out.println(service.display());
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("1.insert");
			System.out.println("2.update");
			System.out.println("3.view");
			System.out.println("4.delete");
			System.out.println("5.search");
			System.out.println("6.exit");
			System.out.println("enter your option");
			int opt=sc.nextInt();
			switch(opt){
				case 1:break;
				case 2:break;
				case 3:
					List<Mobile> list1=service.getAllMobiles();
					for(Mobile m: list1){
					System.out.println("id: "+m.getMobileId());
					System.out.println("name: "+m.getNeme());
					System.out.println("price: "+m.getPrice());
					System.out.println("quantity: "+m.getQuantity());
					System.out.println("-------------------");
					}
					break;
				case 4:break;
				case 5:
					System.out.println("enter price");
					double price=sc.nextDouble();
					List<Mobile> list=service.getMobileByPrice(price);
					for(Mobile m: list){
					System.out.println("id: "+m.getMobileId());
					System.out.println("name: "+m.getNeme());
					System.out.println("price: "+m.getPrice());
					System.out.println("quantity: "+m.getQuantity());
					System.out.println("-------------------");
					}
					break;
				case 6:
		}
	}
}
}