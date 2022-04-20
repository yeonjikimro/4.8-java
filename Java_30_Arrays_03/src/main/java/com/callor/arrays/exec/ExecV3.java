package com.callor.arrays.exec;

public class ExecV3 {
	public static void main(String[] args) {
		
		// 짝수의 개수 출력하시오
		
		int[] intArray = new int[100];
		int i = 0;
		
		for(i = 0; i < intArray.length; i++) {
			intArray[i] = (int)(Math.random() * 100) + 1;
		}
		
		// 짝수의 개수를 세어서 저장할 변수
		int intEvenCount = 0;
		for(i = 0; i < intArray.length; i++) {
			boolean bEven = (intArray[i] % 2) == 0;		
			if(bEven) {
				intEvenCount++;
			}
		}
		System.out.println("짝수의 개수 : " + intEvenCount);
		
		
	}
}
