package com.langfundamentals;

public class Movie {
	//Declaration
	String movieName;
	int releasedYear;
	int ticketPrice;


	public static void main(String[] args) {
		Movie m = new Movie();//object creation
		//Initialization
		m.movieName="Pushpa";
		m.releasedYear=2024;
		m.ticketPrice=250;
		System.out.println("Movie Name :" + m.movieName);
		System.out.println("Released Year : " + m.releasedYear);
		System.out.println("Ticket Price :" + m.ticketPrice);
		
		
		
		

	}

}
