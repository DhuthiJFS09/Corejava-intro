package com.corejava;

public class Customer extends Object{
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize called!");
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Customer c1 = new Customer();
		System.out.println(c1);
		
		Customer c2 = new Customer();
		System.out.println(c2);
		
		Customer c3 = new Customer();
		System.out.println(c3);
		
		int i1 = 0x1dbd16a6;
		System.out.println(i1);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		c1=null;
		c2=null;
		c3=null;
		System.gc();
		
		
		
		



	}

}
