package org.studentinfo;

public class StudentInfo {
public void getStudentInfo(int id) {
	System.out.println("Student id is"+ id);
	
}
public void getStudentInfo(String name, int id) {
	System.out.println("Student name is "+ name);
	System.out.println("Student id is"+ id);
	

}
public void getStudentInfo(long phoneNumber, String email) {
System.out.println("student phoneNumber is"+ phoneNumber);
System.out.println("student email is"+ email);
}

public static void main(String[] args) {
	StudentInfo studentinfo = new StudentInfo();
	studentinfo.getStudentInfo(25417);
	studentinfo.getStudentInfo("Abishek", 25417);
	studentinfo.getStudentInfo(7010545060L, "abishekrandy257@gmail.com");
			
}
}

