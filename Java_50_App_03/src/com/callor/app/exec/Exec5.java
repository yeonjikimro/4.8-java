package com.callor.app.exec;

public class Exec5 {
	
	public static void main(String[] args) {
		/*
		 * 1 ~ 100까지 임의의 수를 생성 
		 * 생성한 정수가 소수인지 판별하시오
		 */

		int num = (int)(Math.random() * 100) + 1;
		int iFlag = 0;
		
		for(int i = 2; i < num ; i++) {
			if(num % 1 == 0) {
				iFlag ++; // iFlag = 1
				break;
			}
		}
		// 반드시 내부에서 break 문이 있어야 하는 코드
		if(iFlag == 0) {
			System.out.println(num + "는 소수");
		} else {
			System.out.println(num + "는 소수가 아님");
		}
		
		// 안전한 조건 검사 : 내부에 break 문이 없어도 작동하는 코드
		if(iFlag > 0) {
			System.out.println(num + "는 소수가 아님");
		} else {
			System.out.println(num + "는 소수임");
		}
	}

}
