package org.system;

public class SchStudent {
	public void getStudentInfo(int id) {
		
		System.out.println("Student id : " + id);		
	}
	
	public void getStudentInfo(int id, String name) {
		
		System.out.println("Studend id : " +id+ " and name : " + name);
	}
	
	public void getStudentInfo(String email, int phoneNum) {
		
		System.out.println("Student email : "+email+ " and phoneNumber : "+phoneNum);
	}
	
	public static void main(String args[]) {
		
		SchStudent C = new SchStudent();
		C.getStudentInfo(21);
		C.getStudentInfo(21, "praveen");
		C.getStudentInfo("brothers@gmail.com", 825865932);
	
	}
}
