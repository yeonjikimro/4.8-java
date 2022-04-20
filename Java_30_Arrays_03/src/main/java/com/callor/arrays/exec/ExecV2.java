package com.callor.arrays.exec;

public class ExecV2 {
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		

		int index = 0;
		int intEven = 0;
	
		/*
		 * 정수형 배열 100개를 선언하고 Math.random()를 사용하여
		 * 1~100까지 임의의 수를 생성하고 각각 요소에 저장
		 * 배열의 각 요소에 저장된 수가 짝수인가 아닌가를 판별하여 출력하시오
		 */
		
		// for() 명령문의 선언부에서 변수를 선언하면
		// for() { } 이 끝날 때 변수가 소멸된다
		// 같은 method 내에서 같은 이름의 변수를 선언할 수 있다.
		
		for(int i = 0; i < intNums.length ; i++) {
			intNums[i] = (int)(Math.random() + 100) + 1;
		}
		
		for(int i = 0; i < intNums.length ; i++) {
			boolean bEven = (intNums[i] % 2) == 0;
			if(bEven) {
				System.out.printf("\t%d는(은) 짝수\n", intNums[i]);
			} else {
				System.out.printf("\t%d 는(은) 짝수가 아님\n", intNums[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		// 내가 한 것
		
		for (index = 0 ; index < intNums.length ; index++) {			
			intNums[index] = (int)(Math.random() * 100) + 1;			
			intEven = intNums[index];
		}
		
		for (intEven = 0 ; intEven < intNums.length ; intEven++) {
			
			if (intEven % 2 == 0) {
				System.out.println(intEven + "는(은) 짝수이다");
			} else {
				System.out.println(intEven + "는(은) 짝수가 아니다");
			}
		}
		
		
		
		
	}
}
