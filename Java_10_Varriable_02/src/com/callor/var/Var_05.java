package com.callor.var;

public class Var_05 {
	
	public static void main(String[] args) {
		
		int intNum1 = 0;
		int intNum2 = 0;
		
		int intSum = 0;
		
		intNum1 = 55;
		intNum2 = 77;
		intSum = intNum1 + intNum2;
		System.out.println(intNum1);
		System.out.println(intNum2);
		System.out.println(intSum);
		
		System.out.print(intNum1);
		System.out.print(" + ");
		System.out.print(intNum2);
		System.out.print(" = ");
		System.out.println(intSum);
		//ln(New Line) - line feed - return
		
		System.out.println(intNum1 
				+ " + " 
				+ intNum2 
				+ " = " 
				+ intSum);
		
		//form : %d (=대치값, decimal number-십진수,정수값)
		//, : 구분자(separate)
		intNum1 = 101;
		intNum2 = 202;
		//\n : 줄건너띄기(new line)
		System.out.printf("%d + %d = %d\n", intNum1, intNum2, intSum);
		System.out.printf("%d + %d = %d\n", intNum1, intNum2, intNum1 * intNum2);
		System.out.printf("%d + %d = %d\n", intNum1, intNum2, intNum1 - intNum2);
		System.out.printf("%d + %d = %d\n", intNum1, intNum2, intNum1 / intNum2);
		
	}

}
