package com.callor.arrays.utils;

public class Line {
	
	/*
	 * Ŭ���� ������ dLine, sLine ���ڿ��� ������ ����
	 * static : ������Ʈ �ڵ尡 ����Ǵ� ���� �׻� �ڵ����� ����� �غ� �ǵ���
	 * 		�����ϴ� Ű����
	 * 
	 * final : ������ final Ű���尡 �����Ǹ�, �ѹ� ����� ���� ���� ������ �� ����(can not be assigned)
	 * ������Ʈ���� �������� �����Ͽ� ����� ������ public static final Ű���带 �Բ� ���ȴ�.
	 * ex) ScoreService1 55line
	 */
	public static final String dLine = "=".repeat(100);
	public static final String sLine = "-".repeat(100);
	
	/*
	 * return type �� ���ڿ���(String ��, String type)��
	 * dLine method ����
	 */
	public static String dLine(int count) {
		String dLine = "=";
		return dLine.repeat(count);
	
	}
	
	/*
	 * int type(������) argument�� 1�� �ְ�
	 * return type �� String type(���ڿ���) �� sLine method ����
	 */
	public static String sLine(int count) {
		String sLine = "-";
		return sLine.repeat(count);
	}
	

}
