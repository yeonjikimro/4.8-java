package com.callor.classes.utls;

public class Line {
	
	public static String dLine(int length) {
		
		//���ڿ��� dLine �����ϰ� = ���ڿ��� �����Ѵ�
		String dLine = "=";
		return dLine.repeat(length);
	}
	
	public static String sLine(int length) {
		return "-".repeat(length);
	}

}
