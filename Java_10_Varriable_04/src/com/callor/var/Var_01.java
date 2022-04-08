package com.callor.var;

public class Var_01 {
	public static void main(String[] args) {
		// 변수에 값 저장하기
		// 변수에 어떤 값을 저장하면 이미 저장된 값은? : 무조건 사라진다
		int intNum1= 33;
		int intNum2 = 55;
		// 4칙연산 결과를 저장(보관)하기 위한 변수 선언 clear
		// intNum1, intNum2 변수에 담긴 값을 읽어와서
		
		
		// 4칙연산을 수행한 후 각각의 변수에 저장하기
		// 변수에 담긴 값을 읽어서 연산을 수행한 후 다른 변수에 저장하기
		int result1 = intNum1 + intNum2;
		int result2 = intNum2 - intNum1;
		int result3 = intNum1 * intNum2;
		int result4 = intNum1 / intNum2;
		
		// 화면에 form 을 만든 후 출력하기
		System.out.printf("\t%d + %d = %d\n", intNum1, intNum2, result1);
		System.out.printf("\t%d - %d = %d\n", intNum2, intNum1, result2);
		System.out.printf("\t%d * %d = %d\n", intNum1, intNum2, result3);
		System.out.printf("\t%d ÷ %d = %d\n", intNum1, intNum2, result4);
				
		
	}
}
