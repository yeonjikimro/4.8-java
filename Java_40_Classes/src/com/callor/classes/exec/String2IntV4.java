package com.callor.classes.exec;

public class String2IntV4 {
	
	public static void main(String[] args) {
		
		// ���� �տ� + �Ǵ� - �� �ִ� ���� ���� ��ȯ �ȴ�.
		String strNum = "-3";
		strNum = "+3";
		
		// +, - �̿��� ��ȣ�� NumberFormatException �߻�
		strNum = "*3";
		int intNum = Integer.valueOf(strNum);
		
	}

}
