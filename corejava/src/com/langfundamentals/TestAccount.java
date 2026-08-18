package com.langfundamentals;

public class TestAccount {
	static int bankID= 1000;
	static String bankName = "SBI";
	static int accNO=0;
	String cName;
	long bal;
	String accountStatus;
	static void display() {
		System.out.println("Bank ID : "+ bankID);
		System.out.println("Bank Name: "+ bankName);
		
	}
	{
		accNO++;
		bankID++;
		
		
	}
//	void count() {
//		accNO++;
//			accNO++;
//	}
	void instancedisplay() {
		System.out.println("Account No :" +accNO);
		System.out.println("Customer Name :" +cName);
		System.out.println("Balance :" +bal);
		System.out.println("Account Status :" +  accountStatus);
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		TestAccount a1 = new TestAccount();
		
		//a1.accNO =509;
		display();
//		a1.count();
		a1.cName="Dhuthi";
		a1.bal=100000000;
		a1.accountStatus="Active";
		a1.instancedisplay();
		
		TestAccount a2 = new TestAccount();
		display();
		a2.accNO=a1.accNO+1;
		a2.cName="Sana";
		a2.bal=1500000000;
		a2.accountStatus="inActive";
		a2.instancedisplay();
		
		
		
		
		
		
		
		System.out.println("main method ended");
		
		

	}

}
