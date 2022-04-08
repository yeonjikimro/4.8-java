package com.callor.controller;
/*
 * add(), multi() 를 선언하고 1~100까지 범위의 임의의 정수 2개를 생성
 * add()는 덧셈, multi()는 곱셈 결과를 return
 * main() 에서 add(), multi()를 호출하여 결과를 변수에 담고 두 변수의
 * 값을 덧셈하여 console에 출력
 */
public class Method_02 {

	public static void main(String[] args) {
		int resulta = add();
		int resultm = multi();
		
		System.out.println(resulta + resultm);
	}
	
	public static int add() {
		int intadd1 = (int)(Math.random() * 100) + 1;
		int intadd2 = (int)(Math.random() * 100) + 1;
		
		return intadd1 + intadd2;
	}
	
	public static int multi() {
		int intmul1 = (int)(Math.random() * 100) + 1;
		int intmul2 = (int)(Math.random() * 100) + 1;
		
		return intmul1 * intmul2;
	}
} 
