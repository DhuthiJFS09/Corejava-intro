package com.langfundamentals;

public class Mobile {
	//static and instance variable declaration
	static String brand;
	String model;
	int price;
	String ram;
	static{
		System.out.println("static block called");
	}
	{
		System.out.println("instance block called");
	}
	static void displaydetails(){
		System.out.println("Brand :" + brand);
		
	}
	void method() {
		//System.out.println("Brand :" + brand);
		System.out.println("Model :"  + model);
		System.out.println("Price :"  + price);
		System.out.println("Ram :"  + model);
		
	}
	

	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		brand="vivo";
		
		
	
		
		System.out.println("************obj1 info*******************");
		
		
		Mobile m1 = new Mobile();//object1 creation
		displaydetails();
		m1.model="v60";
		m1.price=40000;
		m1.ram="8GB";
	    m1.method();
	    
		
		
		
		System.out.println("************obj2 info*******************");
		
		
		Mobile m2 = new Mobile();//object2 creation
		brand="samsung";
		displaydetails();
		
		m2.model="s23 ultra";
		m2.price=60000;
		m2.ram="9GB";
		m2.method();
		
		
		System.out.println("************obj3info*******************");
		
		Mobile m3 = new Mobile();//object3 creation
		brand="one plus";
		displaydetails();
		m3.model="t20";
		m3.price=90000;
		m3.ram="6GB";
		m3.method();
		
		
		
		
		
		
		
		
		
		
	
	
		
		
		
		
		
		
		
	
		System.out.println("main method ended");

	}

}
