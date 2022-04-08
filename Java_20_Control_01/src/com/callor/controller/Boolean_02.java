package com.callor.controller;

public class Boolean_02 {

	public static void main(String[] args) {
		/*
		 * 변수에 값을 담는 방법
		 * 1. 리터럴
		 * 2. 새로운 변수에 변수 저장
		 */
		boolean bYes = true;
		
		// bYes 에 저장된 값을 출력
		System.out.println(bYes);
		
		// bYes 에 저장된 값이 true 인지 비교연산하여 결과를 출력
		System.out.println(bYes == true);
		
		boolean bWhat = bYes; 
		bWhat = bYes == true;
		bWhat = bYes();
		
		
	} // end main()
	
	public static boolean bYes() {
		return true;
	}

}
