package com.yedam.generic;

import java.util.ArrayList;
import java.util.List;

class Apple{
	
}

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>(); //generic - 타입을 정해줌.
		String str = box.get(); //어떤 타입인지 정해줌.
		
		Box<Apple> apple = new Box<Apple>();
		Apple app = apple.get(); //리턴 타입이 정해짐. 애플로.
		System.out.println("end");
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		
		List<Apple> appList = new ArrayList<>();
		appList.add(new Apple());
		
		
		
		
		
		
		/*
		 * Box box = new Box(); box.set("Hello"); String str = (String) box.get();
		 * //string 타입으로 바꿈.
		 * 
		 * box.set(new Integer(10)); Integer num1 = (Integer)box.get();
		 * 
		 * box.set(new Apple()); // Apple apple = (Apple)box.get(); //형태 변환을 해줘야 함. str
		 * = (String) box.get();
		 */
		
	}

}
