package com.cg.spring.core.beans;

import java.util.List;
import java.util.Set;

public class Customer {
	private String firstName;
	private String lastName;
	private Address addr;
	
	List<Address> list;
	Set<String> set;
	
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public List<Address> getList() {
		return list;
	}
	public void setList(List<Address> list) {
		this.list = list;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", addr=" + addr + ", list=" + list
				+ ", set=" + set + "]";
	}
	public Customer() {}
	
	public Customer(String firstName, String lastName, Address addr) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.addr = addr;
	}
	
}
