package com.callor.app;

public class Exec1 {

	public static void main(String[] args) {

		int num= (int) (Math.random() * 26) + 25;
		int pizza = 6;
		
		// 학생수 25~50
		// 피자 한 판 6개
		// 학생수 < 피자수*6
		/*
		 * 피자가 한판에 6조각
		 * 피자를 부족하지 않도록 먹기 위해서
		 * 최소 몇 판의 피자가 필요한가
		 * 
		 * 인원수 / 피자수로 나누었을 때
		 * 그 결과가 0 이거나 최소 1이상이어야 한다.
		 */
		
		if(num % pizza == 0) {
			System.out.printf("인원 %d 는 %d 의 피자가 필요", num, num/pizza);
		} else {
			int pan = (num / pizza) + 1;
			System.out.printf("인원 %d 는 %d 의 피자가 필요", num, pan);
		}
		

	}
}
