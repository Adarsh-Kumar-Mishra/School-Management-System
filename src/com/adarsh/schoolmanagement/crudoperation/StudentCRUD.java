package com.adarsh.schoolmanagement.crudoperation;

import java.util.ArrayList;

import java.util.Iterator;

import com.adarsh.schoolmanagement.entity.Student;

public class StudentCRUD {
   ArrayList<Student> studentList = new ArrayList<Student>();
   public int createStudent(Student s) {
	   studentList.add(s);
	   return s.getRollNo();
   }
   public Student getStudentDetailBYRollNo(int i) {
	   Iterator<Student> itr = studentList.iterator();
	   while(itr.hasNext()) {
		   Student s  = itr.next();
		   if(s.getRollNo()== i) {
			   return s;
		   }
	   }
	   return null;
   }
   public ArrayList<Student> getAllStudent(){
	   return studentList;
   }
   public int updateStudentDetail(Student student) {
	   Iterator<Student> itr = studentList.iterator();
	   int count = 0;
	    while(itr.hasNext()) {
	    	Student s = itr.next();
	    	if(s.getRollNo() == student.getRollNo()) {
	    		studentList.set(count, student);
	    		return student.getRollNo();
	    	}
	    	count++;
	    } 
	    return 0;
   }
   public int deleteStudentDetails(int rollNo) {
//	   Iterator<Student> itr = studentList.iterator();
//	   while(itr.hasNext()) {
//		   Student s = itr.next();
//		   if(s.getRollNo()==rollNo) {
//			   studentList.remove(s);
//			   return s.getRollNo();
//		   }
//	   }
	   
//	   for(int i = 0;i<studentList.size();i++) {
//		   Student s = studentList.get(i);
//		   if(s.getRollNo()==rollNo) {
//		   studentList.remove(s);
//			   return s.getRollNo();
	//	   }
		 for(Student s : studentList) {
			 if(s.getRollNo()==rollNo) {
				   studentList.remove(s);
					   return s.getRollNo();
				   }
		 }  
	   
	   return 0;
   }
   
}







