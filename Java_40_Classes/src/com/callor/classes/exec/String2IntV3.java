package com.callor.classes.exec;

public class String2IntV3 {
	
	public static void main(String[] args) {
		
		/*
		 * NumberFormatExcemption �� �߻��ϴ� ��Ȳ��
		 */
		// 1. ���ڿ� �Բ� ���ڰ� �ƴ� ���ڿ�(space) �� ���Ե� ���
		String strNum = "33 ";
		int intNum = Integer.valueOf(strNum);
		
		// 2. ""(������ ���¹��ڿ�)
		strNum = " ";
		intNum = Integer.valueOf(strNum);
		
		// 3. ���� �յڿ� ���ڿ��� ���Ե� ���
		strNum = "A3A";
		
		// 4. ���� �߰��� ���ڿ��� ���Ե� ���
		strNum = "3 3";
		
		// 5. ���� �߰��� �����ȣ�� ���Ե� ���
		strNum = "3+3";
		
	}
	
}
