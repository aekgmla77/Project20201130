package com.yedam.functional;

import java.util.function.IntBinaryOperator;

public class LamdaExample {
	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		// 최대값
		int max = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) { //원래 방식
				System.out.println("left: " + left + ", right: " + right);
				return left > right ? left : right; //조건에 들어맞으면 left 아니면 right 값을 return.
			}
		});
		System.out.println("최대값: " + max);

		// 최소값//람다식
		int min = maxOrMin((left, right) -> left < right ? left : right);
		System.out.println("최소값: " + min);
		
		
		/*
		 * int max = maxOrMin((left, right) -> { int result = 0; if(left > right) { //다른 방법
		 * result = left; } else { result = right; }); }
		 */
	}
}
