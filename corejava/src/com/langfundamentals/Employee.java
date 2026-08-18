package com.langfundamentals;

public class Employee {
	//variable declaration
	 int empID;
	 String empName;
	 int sal;
	 float exp;
	 char grade;
	 String permanentStatus;
	 
	 void display() {
		 System.out.println("Employee ID :" + empID);
		 System.out.println("Employee Name :" + empName);
		 System.out.println("Salary :" + sal);
		 System.out.println("Experience :" + exp);
		 System.out.println("Grade :" + grade);
		 System.out.println("Permanent Status :" + permanentStatus);
	 }
	 

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("**********obj1 info*************");
		Employee e1 = new Employee();
		e1.empID=101;
		e1.empName="Dhuthi";
		e1.sal=900000;
		e1.exp=3.5f;
		e1.grade='A';
		e1.permanentStatus="Active";
		e1.display();
		
		System.out.println("**********obj2 info*************");
		Employee e2 = new Employee();
		e2.empID=102;
		e2.empName="Sana";
		e2.sal=950000;
		e2.exp=5.0f;
		e2.grade='A';
		e2.permanentStatus="Active";
		e2.display();
		
		
		System.out.println("**********obj3 info*************");
		Employee e3 = new Employee();
		e3.empID=103;
		e3.empName="Likki";
		e3.sal=950000;
		e3.exp=4.0f;
		e3.grade='A';
		e3.permanentStatus="Inactive";
		e3.display();
	
		
		
		
		System.out.println("main method ended");

	}

}
