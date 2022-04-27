package com.callor.app.exec;

public class Exec4 {
	
	public static void main(String[] args) {
		
		/*
		 * 1 ~ 100까지 임의의 수를 생성 
		 * 생성한 정수가 소수인지 판별하시오
		 */
		boolean flag;
		flag = true;

		int num = (int)(Math.random() * 100) + 1;
		
	
			for (int j = 2; j<num; j++) {
				if(num%j == 0) {
					flag = !flag; // flag = false;
					break;
				}	
			} 
			/*
			 * 만약 num 값이 소수인경우 for() 반복문이 모두 완료되고 종료된다.
			 * 그러면 flag는 처음 설정한 값이 변함이 없기 때문에 true 이다
			 * 
			 * 만약 num 값이 소수가 아닌 경우 중간의 if() {} 코드가 실행되어
			 * flag 가 반전되고(즉 false 가 되고) 다음의 if 조건을 만족하지 않아
			 * else {} 코드가 실행된다.
			 */
			if(flag) {
				System.out.println(num + " 는(은) 소수이다");	
			} else {
				System.out.println(num +" 는(은) 소수가 아니다");				
			}
		}

	}


