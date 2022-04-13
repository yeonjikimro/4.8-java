package com.callor.arrays.exec;

public class ExecV4A {
	public static void main(String[] args) {
		
		
		// 짝수들의 합을 구하시오
		
		
		int[] intNum = new int[100];

		// for 문 안의 int i = 0; 변수선언은 for문 안에서만 지정된다.
		for(int i = 0; i < intNum.length; i++) {
			intNum[i] = (int)(Math.random() * 100 ) + 1;
		}
		
		// 짝수인 수를 덧셈할 변수를 선언
		int intSum = 0;
		for(int i = 0; i < intNum.length; i++) {
			boolean bEven = (intNum[i] % 2) == 0;
			if(bEven) {
				// intSum = intSum + intNum[i]
				intSum += intNum[i];
			}
		}
		System.out.println("짝수들의 합: " + intSum);

	}
}
