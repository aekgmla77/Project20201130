package com.yedam.interfaces;
//함수적 인터페이스
interface Cal {
	public void multi(int num); // functional interface - 1개의 추상 메소드를 갖고 있는 인터페이스(구현해야 하는 메소드가 하나다)
}

interface Calculate {
	public void sum(int num1, int num2);
}

public class InterfaceExample2 {
	public static void main(String[] args) {
		Calculate calcu = (int num1, int num2) -> {
				System.out.println(num1 + num2);	
		};
		calcu.sum(3, 5);
		
		calcu = (a, b) -> {
			System.out.println(a * b);
		};
		calcu.sum(3, 5);
		
		calcu = (a, b) -> {
			System.out.println(a / b);
		};
		calcu.sum(25, 10);
		
		Cal cal = (num) -> {
			int result = num * 2;
			System.out.println(result); // 람다 표현식.
		};
		cal.multi(3);

		cal = (a) -> {
			int result = a * a;
			System.out.println(result);
		};
		cal.multi(3);
	}
}
