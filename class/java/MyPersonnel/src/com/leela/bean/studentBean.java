package com.leela.bean;

public class studentBean {

	private String stuId;
	private String stuName;
	private String phnNo;
	private double fees;
	
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "studentBean [stuId=" + stuId + ", stuName=" + stuName + ", phnNo=" + phnNo + ", fees=" + fees + "]";
	}

	
}
