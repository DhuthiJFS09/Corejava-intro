package com.corejava;

public class TestDemo2 {
	static void dhuthi() {
		TestDemo2 t1 = new TestDemo2();
		System.out.println("method1 called");
		//System.out.println("methdo2 called");
		t1.sana();
		
		
	}
    void sana() {
		System.out.println("method2 called");
	}
    static void likki() {
		System.out.println("method3 called");
	} 
     void subbu () {
		System.out.println("method4 called");
	}
     static void hema() {
		System.out.println("method5 called");
	}
     void pandu() {
		System.out.println("method6 called");
		
	}
     static void sai() {
		System.out.println("method7 called");
		TestDemo2 t4 = new TestDemo2();
		t4.yamuna();
	
		
	}
     void yamuna() {
		System.out.println("method8 called");
		
	}
     static void raj() {
		System.out.println("method9 called");
		TestDemo2 t5 = new TestDemo2();
		t5.paru();
		
		
	}

    void paru() {
		System.out.println("method10 called");
		
		
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		dhuthi();
		likki();
		TestDemo2 t2 = new TestDemo2();
		t2.subbu();
		hema();
		TestDemo2 t3 = new TestDemo2();
		t3.pandu();
		sai();
		raj();
		
		
		
		
		
		
		System.out.println("main method ended");
		
	}

}
