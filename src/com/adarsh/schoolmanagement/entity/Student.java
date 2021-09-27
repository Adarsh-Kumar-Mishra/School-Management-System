package com.adarsh.schoolmanagement.entity;

public class Student extends Person {
	private int rollNo;
	private int standard;
	private String areaOfInterest;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public String getAreaOfInterest() {
		return areaOfInterest;
	}

	public void setAreaOfInterest(String areaOfInterest) {
		this.areaOfInterest = areaOfInterest;
	}

	public Student(String name, int age, String address, int rollNo, int standerd,String areaOfInterest) {
		super(name, age, address);
		this.rollNo = rollNo;
		this.standard = standerd;
		this.areaOfInterest = areaOfInterest;
		
	}

	@Override
	public void work() {
		System.out.println("student is working...");
		
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", standard=" + standard + ", areaOfInterest=" + areaOfInterest + "]";
	}

}
