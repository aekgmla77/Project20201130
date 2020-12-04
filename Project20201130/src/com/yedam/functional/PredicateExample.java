package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	static List<String> list = Arrays.asList("Hong", "Hwang", "Kim"); // arrays.aslist(매개값을 여러개 넣으면 출력해줌)

	public static void getname(Predicate<String> pred) { // return 값은 boolean 타입이다 generic type은 <String>
		for (String name : list) {
			if (pred.test(name)) { // if 결과값이 참이면 아래 출력.
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) { //람다식.
		getname((t) -> t.length() > 3);
	}
}
