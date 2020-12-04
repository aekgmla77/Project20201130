package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample1 {
	private static List<Students> list = Arrays.asList(
			new Students("홍길동", "남자", 90),
			new Students("김순희", "여자", 90),
			new Students("김자바", "남자", 95),
			new Students("박한나", "여자", 92)
			);
	public static double avg(Predicate<Students> perdicate) {
		int count = 0, sum = 0;
		for(Students students : list) { //type은 students로 해야 함.
			if(perdicate.test(students)) { 
				count++; //나눠줘야 할 학생 수.
				sum += students.getScore();
			}
		}
		return (double) sum / count;
	}
	
	
	public static void main(String[] args) {
		
		double maleAvg1 = avg(new Predicate<Students>() { //람다식 전 

			@Override
			public boolean test(Students t) {
				System.out.println(t.getName() + "," + t.getSex() + "," + t.getScore());
				return t.getSex().equals("남자");
			}
		});
		System.out.println("===========================");
		
		System.out.println("남자 평균 점수: " + maleAvg1);

		System.out.println("===========================");
		
		
		double maleAvg = avg(t -> t.getSex().equals("남자")); //람다식
		System.out.println("남자 평균 점수: " + maleAvg);
		
		System.out.println("===========================");
		
		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수: " +femaleAvg);
	}

}
