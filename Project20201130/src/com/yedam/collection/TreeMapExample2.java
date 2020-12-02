package com.yedam.collection;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87, "Hong");
		scores.put(98, "Hwang");
		scores.put(75, "Choi");
		scores.put(95, "Park");
		scores.put(80, "Kim");
		System.out.println("scores의 첫번째 값: " + scores.firstEntry().getKey());

		NavigableMap<Integer, String> navigableMap = scores.descendingMap();
		navigableMap.firstEntry();
		System.out.println("navigableMap의 첫번째 값: " + navigableMap.firstEntry().getKey()); // 내림차순의 역순

		NavigableSet<Integer> nSet = scores.descendingKeySet(); // 키 값만 역순으로 하겠다라는 뜻임.
		System.out.println("scores의 첫번째 키: " + scores.firstKey());
		System.out.println("nSet의 첫번째 키: " + nSet.first()); // 역순

		// {34, 55, 26, 48, 77} 오름차순으로 정렬.
		
		int[] intAry = { 34, 55, 26, 48, 77 };
		TreeSet<Integer> number = new TreeSet<>();
		for (int i = 0; i < intAry.length; i++) {
			number.add(intAry[i]);

		}
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = number.pollFirst();
		}

		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
	}
}
