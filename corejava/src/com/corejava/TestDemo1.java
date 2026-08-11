package com.corejava;

public class TestDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
	   System.out.println("Main method Started!");
	   
	   System.out.println("java.lang.String");
	   System.out.println("java.lang.System");
	   System.out.println(Class.forName("com.corejava.MyFirstProgram"));
       System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));

	}

}
