package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World1");
		set.add("World1");
		set.add("Welcome");

		for (String str : set) {
			System.out.println(str);
		}

		Iterator<String> iter = set.iterator(); // 반복된 값을 가져오지 못함.
		while (iter.hasNext()) { // hasnext는 값이 있는지 물음. String str = iter.next();
			System.out.println(iter.next());
		}
		Set<Integer> numbers = new HashSet();
		numbers.add(13);
		numbers.add(26);
		numbers.add(38);

		numbers.remove(26);

		int sum = 0;
		for (Integer i : numbers) {
			sum += i;
		}

		System.out.println("numbers: " + sum);

		Set<Integer> listnum = new HashSet<>();
		listnum.add(10);
		listnum.add(15);
		listnum.add(20);
		listnum.add(25);
		listnum.add(30);
		listnum.add(35);
		listnum.add(40);
		listnum.add(20);
		listnum.add(25);

		int sum1 = 0;
		
		for (Integer j : listnum) {
			sum1 += j;

		}
		System.out.println("총 합계: " + sum1);
		
		listnum.remove(20);
		listnum.remove(25);

		int sum2 = 0;
		
		for (Integer x : listnum) {
			sum2 += x;

		}
		System.out.println("중복 제외 합계: " + sum2);
	}
}
