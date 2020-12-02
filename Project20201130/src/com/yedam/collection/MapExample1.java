package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		double avg = 0;

		Set<String> set = map.keySet();
		for (String str : set) {
			totalScore += map.get(str);
			avg = (double) totalScore / map.size();
		}
		System.out.println("평균점수: " + avg);
		
		/*
		 * maxScore = map.get(0); for(int i = 0; i < map.get(0).legnth; i++) {
		 * 
		 * }
		 */	
	}

}
