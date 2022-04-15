package com.callor.classes.exec;

import com.callor.classes.utls.Line;

public class String2IntV1 {

	public static void main(String[] args) {
		
		String strAge = "";
		int intAge = 33; // ������ ����
		
		// ������ ���� + "���ڿ�" : ���ڰ��� ���ڿ��� ������ ����ȯ
		strAge = intAge + "";
		
		// Integer.toString(������) :
		// Integer Ŭ������ ����� toString static method ����
		// ������ arg �� �����Ͽ� ���ڿ��� return �޴´�.
		// Integer.toString() : ������ ���ڸ� ���ڿ��� ���ڷ� �ٲ۴�
		strAge = Integer.toString(intAge);
		
		System.out.println(strAge);
		// Integer.valueOff() : ���ڿ��� ���ڸ� ������ ���ڷ� �ٲ۴�
		strAge = "55"; // ���ڿ��� ����
		intAge = Integer.valueOf(strAge);
		
		System.out.println(Integer.toBinaryString(33));

		
		
		int num1 = 33;
		int num2 = 55;
		String strBinNum1 = Integer.toBinaryString(num1);
		String strBinNum2 = Integer.toBinaryString(num2);
		
		
		int intSum = num1 + num2;		
		String strSum = Integer.toBinaryString(intSum);
		
		System.out.println(Line.dLine(20));
		System.out.printf("	   %s\n", strBinNum1);
		System.out.printf(" +  %s\n", strBinNum2);
		System.out.println(Line.sLine(20));
		System.out.printf("   %s\n", strSum);
		System.out.println(Line.dLine(20));
	
		
		
	}
}
