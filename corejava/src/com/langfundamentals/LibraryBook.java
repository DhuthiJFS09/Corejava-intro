package com.langfundamentals;

public class LibraryBook {
	// declaration and initialization
	int bookID = 101;
	String bookTitle = "xyz";
	String authorName = "Dhuthi";
	int availableCopies = 9;
	String libraryName = "Vcube";
	String librarianName = "SGill";

	// instance method
	void displayBookDetails() {
		System.out.println("BookDeatils method called");
		System.out.println("----- Book 1 Details -----");

		System.out.println("Book ID  : " + bookID);
		System.out.println("Book Title  : " + bookTitle);
		System.out.println("Author Name : " + authorName);
		System.out.println("Available Copies  : " + availableCopies);

	}

	void displayLibraryDetails() {
		System.out.println("Library Name  : " + libraryName);
		System.out.println("Librarian Name  : " + librarianName);
	}

	

	void changeLibrarian(String newLibrarianName) {
		
        librarianName = newLibrarianName;
    }
//      void changeLibrarian() {
//    	  
//      }
	public static void main(String[] args) {
		System.out.println("main method started");
		LibraryBook lb1 = new LibraryBook();// object1 creation
		lb1.displayBookDetails();// method call
		lb1.displayLibraryDetails();
		lb1.changeLibrarian("Koushik");
//		LibraryBook lb2=new LibraryBook();
//		

		System.out.println("-----After Changing Librarian-----------");
		lb1.displayLibraryDetails();
		System.out.println("main method ended");

	}

}
