package com.corejava;

public class Cricket {
//Declaration
	static int countryID;
	static  String countryName;
	 
	int jerseyNumber;
	String CricketerName;

	public static void main(String[] args) {
		System.out.println("main method started!");
		//Accessing the static data
		System.out.println(countryID);
		System.out.println(countryName);
		//Inorder to access instance data we must need to create object.
		
		//System.out.println(jerseyNumber);
		//System.out.println(CricketerName);
		
		
	}

}
