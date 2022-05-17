package com.callor.app.exec;

public class Exec02 {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		
		// 배열에 값을 채워 넣는 부분
		for(int i = 0; i < nums.length; i++) {
			
			int num = (int)(Math.random() * 100) + 1;
			
			nums[i] = num;
		}
		
		
		// 연산하는 부분
		int intA = 0;
		int intSum = 0;
		for(int num : nums) {
			
			if(num % 2 == 0) {
				intA++;
				intSum += num;				
			}
		}
		System.out.println("짝수의 개수 : " + intA);
		System.out.println("짝수의 합 : " + intSum);
		
	}
}
