package com.callor.app.exec;

public class Exec6 {

	public static void main(String[] args) {
		
		/*
		 * 1 ~ 100까지 임의의 수를 생성 
		 * 생성한 정수가 소수인지 판별하시오
		 */

		int num = (int)(Math.random() * 100) + 1;
		
		int index = 0;
		for(index = 2; index < num ; index ++) {
			if(num % index == 0) {
				break;
			}
		}
		if(index < num) {
			System.out.println(num + "는 소수가 아님");
		} else {
			System.out.println(num + "는 소수임");
		}
		
	}
}
