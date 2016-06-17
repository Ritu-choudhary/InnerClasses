package com.Netmax;

class A {
	public int a = 10;

	public static  int b = 20;

	public void getData() {
		System.out.println("Value of a :: " + a);
		System.out.println("Value of b :: " + b);
	}
}

public class Vinay1 {

	public static void main(String[] args) {
		A obj1 = new A();
		obj1.getData();

		obj1.a = 15;
		obj1.b = 25;

		A obj2 = new A();
		obj2.getData();
		
		obj1.getData();

	}
}

//Value of a :: 10
//Value of b :: 20
//Value of a :: 10
//Value of b :: 25
//Value of a :: 15
//Value of b :: 25
