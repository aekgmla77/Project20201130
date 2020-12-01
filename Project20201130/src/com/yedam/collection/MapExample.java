package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry; //중첩 클래스
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Hong1", 35); //추가 방법 hong은 key, 15는 value
		map.put("Hwang", 20);
		map.put("Hong", 25); //같은 key가 있으면 기존 값은 무시하고 밑에 있는 걸 출력함.
		
		Integer val = map.get("Hong");
		System.out.println(val);
		
		System.out.println("-----------------------1");
		Set<String> set1 = map.keySet();
		for(String name : set1) {
			System.out.println("key: " + name + ", val: " +  map.get(name));
		}
		System.out.println("-----------------------2");
		Set<Entry<String,Integer>> entrySet1 = map.entrySet();
		for(Entry<String,Integer> ent1 : entrySet1) {
			System.out.println("key: " + ent1.getKey() + ", val: " + ent1.getValue());
		}
		
		Map<Integer, String> mapInt = new HashMap<>(); //타입 생략 가능.
		mapInt.put(10, "김다현");
		mapInt.put(20, "이혜빈");
		mapInt.put(30, "이나경");
		String result = mapInt.get(20);
		System.out.println("-----------------------3");
		System.out.println(result);
		
		System.out.println("-----------------------4");
		Set<Integer> set = mapInt.keySet(); //keyset은 key 값만 뽑아오는 거.
		for(Integer num : set) {
			System.out.println("key: " + num + ", val: " + mapInt.get(num));
		}
		System.out.println("-----------------------------------5");
		Set<Entry<Integer, String>> entrySet = mapInt.entrySet(); //key, value 값을 다 가져와서 set에 담는다.
		for(Entry<Integer, String> ent : entrySet) {
			System.out.println("key: " + ent.getKey() + ", val: " + ent.getValue());
			
		}
	}
}
