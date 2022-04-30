package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
public void studentName() {
	System.out.println("Student Name");
}
public void studentDepartment() {
	System.out.println("Student Department");
}
public void studentID() {
	System.out.println("Student ID");
}
public static void main(String[] args) {
	College college = new College();
	college.collegeName();
	college.collegeCode();
	college.collegeRank();
	
	Department department = new Department();
	department.deptName();
	
	Student student = new Student();
	student.studentName();
	student.studentDepartment();
	student.studentID();
}
}
