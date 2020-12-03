package com.yedam.interfaces;

//함수적 인터페이스...Functional lInterface
interface MyFunctionalInterface {
	public void run(int radius);
}

public class InterfaceExample3 {
	public static void main(String[] args) {

		MyFunctionalInterface mfi = null;
		// 1.화면 출력( 원의 넓이 구하는 기능 구현)
		mfi = (radius) -> {
			double result = Math.PI * radius * radius;
			System.out.println("원의 넓이는: " + result);
		};
		mfi.run(5);
		// 2. 화면 출력( 밑변으로 가지는 삼각형의 넓이 구하는 기능)
		mfi = (radius) -> {
			double result = 1.73 /4 * radius * radius;
			System.out.println("삼각형의 넓이는: " + result);
		};
		mfi.run(5);
		// 3.화면 출력( 정사각형의 넓이를 구하는 기능 구현)
		mfi = (radius) -> {
			double result = radius * radius;
			System.out.println("정사각형의 넓이는: " + result);
		};
		mfi.run(5);
		
		System.out.println("===================================");

		// 원의 넓이
		MyFunctionalInterface myfu = (int radius) -> {
			System.out.println(radius * radius * 3.14);
		};
		myfu.run(5);
		// 정사각형의 넓이
		myfu = (radius) -> {
			System.out.println(radius * radius);
		};
		myfu.run(5);
		// 삼각형의 넓이
		myfu = (radius) -> {
			System.out.println(radius * radius * 1 / 2);
		};
		myfu.run(5);

		// 1.화면 출력( 원의 넓이 구하는 기능 구현) 2. 화면 출력( 밑변으로 가지는 삼각형의 넓이 구하는 기능)
		// 3.화면 출력( 정사각형의 넓이를 구하는 기능 구현)
	}

}
