package com.callor.app.exec;

public class Exec1 {

	/*
	 * 10개의 정수형 배열을 생성하고
	 * 1 ~ 100까지 임의 정수를 생성하여
	 * 각 배열의 요소에 저장하시오
	 */
	public static void main(String[] args) {
		
		int[] intArray = new int[10];
		
		
		for(int i = 0; i < intArray.length; i++) {		
			// int array = (int)(Math.random() * 100) + 1;
			// intNums[i] = array;
			intArray[i] = (int)(Math.random() * 100) + 1;					
		}
		
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + "\t");
		}
	}
}
