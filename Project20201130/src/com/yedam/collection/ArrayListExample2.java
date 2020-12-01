package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListExample2 {
	public static void main(String[] args) {
		
		System.out.println("Hello".hashCode());
		System.out.println("Hello".hashCode());
		
		List<String> list = new ArrayList<>();
		list.add(new String("Hello"));
		list.add(new String("World"));
		list.add(("Welcome"));
		list.add(new String("Hello"));
		
		list.get(1); // get - 가지고 오고 싶은 몇 번째 글자.
		
		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
		}
		for(String str : list) {
//			System.out.println(str);
		}
		
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Hello"); // set은 중복된 값은 제외함. 
		
		Iterator<String> iter = set.iterator(); //set이 가진 반복문. 
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		for(String str : set) {
			System.out.println(str);
		}
		System.out.println("========================");
		Set<Fruit> fruits =  new HashSet<>();
		fruits.add(new Fruit("Apple", 1000)); //인스턴스가 달라서 다 출력됨.
		fruits.add(new Fruit("Banana", 1500));
		fruits.add(new Fruit("Orange", 1500));
		fruits.add(new Fruit("asdfd", 1000));
		
		
		
		Iterator<Fruit> fiter = fruits.iterator();
		while(fiter.hasNext()) {
			Fruit fruit = fiter.next();
			System.out.println(fruit.getName() + "-" + fruit.getPrice()); //Fruit에 논리적으로 동일한 개체만 나오게 지정.
			
		}
		
	}
}
