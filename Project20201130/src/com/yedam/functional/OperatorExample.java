package com.yedam.functional;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	
	static int[] scores = {92, 95, 87};
	
	static int maxOrMin(IntBinaryOperator bi) { //선언 안 하면 디폴트 값임.
		int result = scores[0];
		for(int number : scores) {
			result = bi.applyAsInt(result, number);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int maxValue = maxOrMin(new IntBinaryOperator() { //두개 중 큰 거 return.

			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " + left + ", right: " + right);
				return left > right ? left : right; //left가 크면 left를 출력 아니면 right 출력.(큰 값 출력)
			}
		});
		System.out.println("제일 큰 값: " + maxValue);
		
		int minValue = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " + left + ", right: " + right);
				
				/* if(left == 0) { 
				 * left = right; 
				 * } */
				 
				return left < right ? left : right;
			}
			
		});
		System.out.println("제일 작은 값: " + minValue);
	}
}
