package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Hello");
		list.add("World");
		list.add("Welcome");
		list.add(1, "Nice"); //특정 위치에 값을 담으려면 앞에 몇번째인지 숫자.
		System.out.println("size: " + list.size()); //size로 마지막 위치에 넣겠다는 뜻.
		list.add(list.size(), "last");
		
		
		list.remove(1); //인덱스 값으로 두번째 값을 지운다는 뜻. 리무브를 하면 해당되는 위치를 아예 없애고 순서대로 값을 출력함.
		for(int i = 0; i < list.size(); i++) {
			System.out.println("index: " + i + "," + list.get(i)); //해당되는 값을 인덱스 값으로 가져오겠다.
		}
		List<Integer> listNum = new ArrayList<>();
		listNum.add(100);
		listNum.add(200);
		listNum.add(300);
		int sum = 0;
		for(Integer num : listNum) {
			sum += num;
			
		}
		System.out.println("listNum합계: " + sum);
	}
}
