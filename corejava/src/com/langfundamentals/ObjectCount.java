package com.langfundamentals;

public class ObjectCount {
	static int c = 0;

	{

		c++;
	}

	public static void main(String[] args) {
		ObjectCount oc1 = new ObjectCount();
		ObjectCount oc2 = new ObjectCount();
	    System.out.println("Count : " + c);

	}

}
