package com.callor.var;
/*
 * 두 개의 정수형 변수를 선언하고
 * 각각 55와 33을 저장한 후
 * 변수를 활용하여 사칙 연산을 수행하라.
 *
 */
public class Var_01 {
	public static void main(String[] args) {
		/*
		 * 1. 변수명은 키워드 등으로 사용할 수 없다.
		 * 2. 같은 변수명은 한 블럭( {} ) 내부에서 두 번 이상
		 * 		선언할 수 없다.
		 * 3. 변수명은 첫글자가 반드시 소문자다.
		 * 4. 두 단어 이상을 조합하여 의미있는 단어로 작성
		 */
		
		// 변수 선언과 0으로 초기화(clear라고 표현)
		int intNum1 = 0;
		int intNum2 = 0;
		
		
		intNum1 = 55;
		intNum2 = 33;
		
		System.out.println(intNum1 + intNum2);
		System.out.println(intNum1 - intNum2);
		System.out.println(intNum1 * intNum2);
		System.out.println(intNum1 / intNum2);
	}
}
