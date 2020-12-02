package com.yedam.collection;

import java.util.TreeSet;

public class MapExample4 {
	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<>(); //크다, 작다 기준이 있어야 함.
		tset.add(50);
		tset.add(30);
		tset.add(45);
		tset.add(55);
		
		System.out.println("------------------------");
		System.out.println(tset.first());//작은 수
		System.out.println(tset.last());//제일 큰 수
		
		TreeSet<String> tstr = new TreeSet<>();
		tstr.add("Hong");
		tstr.add("Hwang");
		tstr.add("Park");
		tstr.add("Choi");
		
		System.out.println("------------------------");
		System.out.println(tstr.first());
		System.out.println(tstr.last());
		
	    TreeSet<Student> tstu = new TreeSet<>();
	    tstu.add(new Student(100, "Hong", 70));
	    tstu.add(new Student(101, "Hwang", 80));
	    tstu.add(new Student(102, "Park", 90));
	    
	    System.out.println("------------------------");
	    System.out.println(tstu.first().getStudentNo() + "," + tstu.first().getStudentName());
		System.out.println(tstu.last().getStudentNo() + "," + tstu.last().getStudentName());
	    
	}

}
