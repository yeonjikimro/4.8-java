package com.callor.arrays.exec;

public class ExecV5 {
	public static void main(String[] args) {
		
	// 1 ~ 100���� ���� �����Ͽ� ���
		
		int intSum = 0;
		// for ������ �񱳹��� �� �������� ���� �ִ°� ���� i<101(x)
		for(int i = 0; i < 100; i++) {
			
			intSum += (i + 1);
		}
		
		System.out.println(intSum);

	}
}

