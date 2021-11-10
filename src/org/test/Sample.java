package org.test;

public class Sample {
	private void tc1() {
	System.out.println("method 1");

	}
	private void tc2() {
		System.out.println("method 2");

	}
	private void tc3() {
		System.out.println("method 3");
		
}
	private void tc4() {
System.out.println("method4");
	}
	public static void main(String[] args) {
		Sample s = new Sample();
		s.tc1();
		s.tc2();
		s.tc3();
	}
}
