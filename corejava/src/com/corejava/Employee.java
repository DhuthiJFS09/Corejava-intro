package com.corejava;

public class Employee {
	static String deptName="cse";
	static String location="hyderabad";
	
	int empID;
	String name;
	String mobile;
	String email;

	public static void main(String[] args) {
		System.out.println("Main method started!");
		System.out.println("****object1 info********");
		
		System.out.println("Department Name :"+ deptName);
		System.out.println(location);
		
		 Employee dhuthi= new Employee();
		 dhuthi.empID=9;
		 dhuthi.name="Dhuthi Bhavani";
		 dhuthi.mobile="9121805015";
		 dhuthi.email="dhuthi@gamil.com";
		 
		 System.out.println(dhuthi.empID);
		 System.out.println(dhuthi.name);
		 System.out.println(dhuthi.mobile);
		 System.out.println(dhuthi.email);
		
		

	}

}
