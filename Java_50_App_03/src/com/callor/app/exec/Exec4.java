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
					flag = false;
					System.out.println(num +" 값은 소수가 아니다");
					break;
				}	
			} if(flag == true) {
				System.out.println(num + " 값은 소수이다");	
			}

		}

	}


