package com.adarsh.schoolmanagement.main;

import java.util.Scanner;

import com.adarsh.schoolmanagement.crudoperation.StudentCRUD;
import com.adarsh.schoolmanagement.entity.Student;

public class Main {
	
	StudentCRUD studentCRUD = new StudentCRUD();
	
   public static void main(String[] args) {
	   Main m = new Main();
	
	System.out.println("Welcome to school management");
	Scanner scn = new Scanner(System.in);
	int parentChoice;
	do {
		System.out.println("1.Enter 1 to perform student related operation \n 2.Enter 2 to close the application");
	    parentChoice =scn.nextInt();
	    int childChoice;
	    if(parentChoice >=1 && parentChoice <= 5) {
	    switch(parentChoice) {
	    case 1:
	    	System.out.println("Enter to perform student crud 1 to 6");
	    	childChoice = scn.nextInt();
	    	m.studentTask(childChoice,scn);
	    	break;
	    case 2:
	    System.out.println("Thankyou for using our services");
	    break;
	    }	
	    	
	    	
	    	
	    	
	    }else {System.out.println("Enter a valid no");};
	}while(parentChoice != 2 );
}

private void studentTask(int childChoice, Scanner scn) {
	switch(childChoice) {
	case 1:
		Student s = getStudentDetailsFromUser(scn);
	    System.out.println("Student is created and added to student list with "
		                    + studentCRUD.createStudent(s)+"rollNo");
		break;
	}
	
}

private Student getStudentDetailsFromUser(Scanner scn) {
	System.out.println("Please enter following student details..");
	System.out.println("enter name");
	String name = scn.next();
	System.out.println("enter age");
	int age = scn.nextInt();
	System.out.println("enter address");
	String address = scn.next();
	System.out.println("enter roll no");
	int rollNo = scn.nextInt();
	System.out.println("enter standerd");
	int standerd = scn.nextInt();
	System.out.println("enter area of interest");
	String areaOfInterest = scn.next();
	Student s = new Student(name, age, address, rollNo,standerd,areaOfInterest);
	
	return s;
	//return null;
}



}









