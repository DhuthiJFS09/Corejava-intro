package com.langfundamentals;

public class TestDemo1 {
	//static variables declaration
	static int cID=101;
	static  String cName="MRITS";
	
	//Instance variables  Declaration
	int sID;
	String sName;
	
	static void display(){
		System.out.println("College ID : " + cID);
		System.out.println("College Name : " + cName);
		TestDemo1 d = new TestDemo1();
        d.sID = 509;
		d.sName="Dhuthi";
		System.out.println("Student ID : " + d.sID);
		System.out.println("Student Name : " + d.sName);
		
	}
	void instancecall() {
				
		System.out.println("Student ID : " + sID);
		System.out.println("Student Name : " + sName);
		
	}
	

	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		TestDemo1 d = new TestDemo1();
		d.sID = 509;
		d.sName="Dhuthi";
		display();
    	d.instancecall();
		
		
		
		
		
		
		
		
		System.out.println("main method ended");

	}

}
