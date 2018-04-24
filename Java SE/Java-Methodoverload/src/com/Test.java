package com;

public class Test {

	public void fun(byte x) {
		System.out.println("--- byte : " + x);
	}

	public void fun(short x) {
		System.out.println("--- short : " + x);
	}

	public void fun(int x) {
		System.out.println("--- int : " + x);
	}

	public void fun(long x) {
		System.out.println("--- long : " + x);
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.fun((byte)100);
		
		

	}

}
