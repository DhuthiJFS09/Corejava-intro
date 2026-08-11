package com.corejava;

public class TestDemo6 {

	void method1() {
		method2();
		System.out.println("method1 called");

	}

	void method2() {
		System.out.println("method2 called");
		method3();
		

	}

	void method3() {
		method4();
		System.out.println("method3 called");

	}

	void method4() {
		method5();
		System.out.println("method4 called");

	}

	void method5() {
		method6();
		System.out.println("method5 called");

	}

	void method6() {
		System.out.println("method6 called");

	}

	public static void main(String[] args) {

		System.out.println("main method started");
		TestDemo6 t = new TestDemo6();
		t.method1();
		System.out.println("main method ended");
		

	}

}
