package com.callor.var;

public class Var_01 {
	public static void main(String[] args) {
		
		// 실수(double) 형으로 선언을 할 경우 0보다는 0.0 처럼
		// 명확하게 표현하는 것이 좋다.
		
		double douNum1= 0.0;
		double douNum2= 0.0;
		
		douNum1 = Math.random() * 1000;
		douNum2 = Math.random() * 1000;
		
		double result1 = (douNum1 + douNum2);
		double result2 = (douNum1 - douNum2);
		double result3 = (douNum1 * douNum2);
		double result4 = (douNum1 / douNum2);
	
		
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
	}
}
