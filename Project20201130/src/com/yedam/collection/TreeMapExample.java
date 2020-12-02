package com.yedam.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>(); //int는 클래스가 아니라서 올 수 없음.
		scores.put(87, "Hong");
		scores.put(98, "Hwang");
		scores.put(75, "Choi");
		scores.put(95, "Park");
		scores.put(80, "Kim");
		
		Set<Integer> set = scores.keySet();
		for(Integer num : scores.keySet()) { //key의 값을 가져와서 set에 담는다
			System.out.println(num);
		}
		for(Map.Entry<Integer, String> ent : scores.entrySet()) {
			System.out.println(ent.getKey() +", " + ent.getValue());
		}
		
		Map.Entry<Integer, String> ent = scores.firstEntry(); //import or map. 추가하기
		ent.getKey();
		ent.getValue();
		
		ent = scores.lastEntry();
		ent.getKey();
		ent.getValue();
	}
}
