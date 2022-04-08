package com.callor.controller;

public class Boolean_04 {

	public static void main(String[] args) {
		
		boolean bYes1 = true;
		boolean bYes2 = true;
		
		int intNum1 = 33;
		int intNum2 = 55;
		
		bYes1 = intNum1 == intNum2; // false
		bYes2 = intNum1 < intNum2; // true
		/*
		 * || : boolean 데이터의 OR(덧셈) 연산
		 * && : boolean 데이터의 AND(곱셈) 연산
		 */
		boolean bWhat = bYes1 || bYes2;
		bWhat = bYes1 && bYes2;
		
		// (intNum1 == intNum2) OR (intNum2 M intNum2)
		if (bYes1 || bYes2) {
			System.out.println(intNum1 + "가 " + intNum2 + " 보다 작거나 같다");
		}
		
		bWhat = !(bYes1 || bYes2);
		System.out.println(bWhat); // false
		// !(false And true)
		bWhat = !(bYes1 && bYes2);
		System.out.println(bWhat); // true
	}
//A     B   +(OR)  *(AND)
//F(0) F(0)  F(0)   F(0)
//T(1) F(0)  T(1)   F(0)
//F(0) T(1)  T(1)   F(0)
//T(1) T(1)  T(1)   T(1)
}
