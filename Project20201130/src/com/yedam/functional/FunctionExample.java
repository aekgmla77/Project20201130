package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionExample { // arrays 인스턴스로 값들을 받으면 List<Student>에 담아준다.
	public static List<Student> list = Arrays.asList(new Student("Hong", 90, 96), new Student("Hwang", 95, 93));

	
	
	
	
	public static void printString(Function<Student, String> func) { // student 입력받는 값(매개값), string -반환되는 값.
		for (Student student : list) {
			System.out.println(func.apply(student));
		}
	}

	
	
	
	// 매개값을 student로 받겠다는 의미.
	public static void printInt(ToIntFunction<Student> func) {// printInt(Function<Student, Integer> func 랑 비슷하게 쓰인다.
		for (Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	}

	public static double avg(ToDoubleFunction<Student> func) {
		double result = 0, sum = 0;
		for(Student student : list) {
			result = func.applyAsDouble(student);
			sum += result;
		}
		return sum / list.size();
	}

	
	public static void main(String[] args) {
		System.out.println("[영어평균]");
		double avg = avg(new ToDoubleFunction<Student>() {//avg(new ToDoubleFunction<Student>() -> 메소드 double avg -> 변수

			@Override
			public double applyAsDouble(Student value) {
				return value.getEngScore();
			}
		});
		System.out.println("result: " + avg);
		
		
		
		
		System.out.println("====================");
		
		
		
		
		System.out.println("[학생별 합계점수]");
		printInt(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore() + value.getMathScore();
			}
		});
		
		
	
	
	
		

		System.out.println("====================");

		System.out.println("[영어점수]");
		printInt(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}
		});
		
		
		
		
		
		System.out.println("====================");
		
		Function<String, Integer> func = null;
		func = new Function<String, Integer>() { // function 입력값, 출력값이 다 있다
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		System.out.println(func.apply("Hello"));
		BiFunction<String, String, Integer> biFunc = null;

		
		
		
		
		System.out.println("====================");

		System.out.println("[학생이름 - 영어점수]");
		printString(t -> t.getName() + ", " + t.getEngScore()); // 이름만 가져옴

	}
}
