package com.callor.classes.utls;

public class Line {
	
	public static String dLine(int length) {
		
		//문자열형 dLine 선언하고 = 문자열을 저장한다
		String dLine = "=";
		return dLine.repeat(length);
	}
	
	public static String sLine(int length) {
		return "-".repeat(length);
	}

}
