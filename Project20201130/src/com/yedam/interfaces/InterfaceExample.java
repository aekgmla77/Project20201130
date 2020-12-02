package com.yedam.interfaces;

interface Runnable {
	public void run();

}

class AutoRun implements Runnable {
	@Override
	public void run() {
		System.out.println("자동실행.");
	}
}

class NewRun implements Runnable {
	@Override
	public void run() {
		System.out.println("새로운 실행.");
	}

}

public class InterfaceExample {
	public static void main(String[] args) {
		Runnable runnable = new AutoRun(); // 구현 클래스 생성자 호출해야 함.
		runnable.run();
		runnable = new NewRun();
		runnable.run();

		runnable = new Runnable() {// 인터페이스는 생성자 없고 메소드 정의도 없어서 new 키워드로 새로운 거 못 만든다.
            	    				// 클래스 선언 없이 괄호 안에서 쓰겠다는 뜻.
			@Override
			public void run() {
				System.out.println("익명 실행.");

			}

		};
		runnable.run();

		runnable = () -> System.out.println("또 다른 익명 실행."); //람다 표현식. 뺄 건 빼고 필요한 것만 적어놓는 거.
		//매개 표식식이랑 실행문을 화살표로 연결.
		runnable.run();
	}
}