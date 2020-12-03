package com.yedam.interfaces;

public class InterfaceExample4 {
	public static void main(String[] args) {// 자바 8부터 람다식 사용가능.
		MyInterface mi = null;
		mi = (a, b) -> a + b;

		int result = mi.run(10, 20);

		mi = (num1, num2) -> num1 * num2;
		result = mi.run(5, 10);

		// 두 개의 변수(직사각형의 가로, 세로) -> 넓이 구하는 기능 구현.

		mi = (c, d) -> c * d;
		result = mi.run(5, 8);
		System.out.println("결과값: " + result);
		
		
		/*
		 * mi = new MyInterface() {
		 * 
		 * @Override public int run(int num1, int num2) { return num1 * num2; }
		 * 
		 * }; result = mi.run(5, 4); System.out.println(result);
		 */
	}
}
