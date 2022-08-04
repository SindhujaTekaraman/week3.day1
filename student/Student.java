package org.student;

import org.department.Department;

public class Student extends Department
{
	// Creating Methods - studentName(), studentDept() and studentId() 
	public void studentName()
	{
		System.out.println("Student Name: Sai Ram");
	}
	public void studentDept()
	{
		System.out.println("Student Department: Statistics");
	}
	public void studentId()
	{
		System.out.println("Student Id: 23717272");
	}
	
	public static void main(String[] args) 
	{
		//Object creation
		Student objStudent = new Student();
		
		//To call the methods from Class - College
		objStudent.collegeName();
		objStudent.collegeCode();
		objStudent.collegeRank();
		
		//To call the method from Class - Department
		objStudent.deptName();
		
		//To call the methods from Class - Student
		objStudent.studentName();
		objStudent.studentId();
		objStudent.studentDept();
	}
}
