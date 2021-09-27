package com.adarsh.schoolmanagement.entity;

public class School {
     String name;
     String yearOfOpening;
     String medium;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYearOfOpening() {
		return yearOfOpening;
	}
	public void setYearOfOpening(String yearOfOpening) {
		this.yearOfOpening = yearOfOpening;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
     public School() {
    	 
     }
     public School (String name, String year, String medium) {
    	 this.name = name;
    	 this.yearOfOpening = year;
    	 this.medium = medium;
     }
	@Override
	public String toString() {
		return "School [name=" + name + ", yearOfOpening=" + yearOfOpening + ", medium=" + medium + "]";
	}
     
}
