package org.system;

public class Students  extends Department{
	 public void studentName()
	 {
		 System.out.println("xxxx");
	 }
	 public void studentDept()
	 {
		 System.out.println("bca");
	 }
	 public void studentId()
	 {
		 System.out.println("001");
	 }
	   public static void main(String[] args) {
		Students A= new Students();
		A.collegeName();
		A.collegeCode();
		A.collegeRank();
		A.departmentname();
		A.studentName();
		A.studentDept();
		A.studentId();
	}
}
