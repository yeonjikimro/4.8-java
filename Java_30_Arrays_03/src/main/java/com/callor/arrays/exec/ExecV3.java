package com.callor.arrays.exec;

public class ExecV3 {
	public static void main(String[] args) {
		
		// ¦���� ���� ����Ͻÿ�
		
		int[] intArray = new int[100];
		int i = 0;
		
		for(i = 0; i < intArray.length; i++) {
			intArray[i] = (int)(Math.random() * 100) + 1;
		}
		
		// ¦���� ������ ��� ������ ����
		int intEvenCount = 0;
		for(i = 0; i < intArray.length; i++) {
			boolean bEven = (intArray[i] % 2) == 0;		
			if(bEven) {
				intEvenCount++;
			}
		}
		System.out.println("¦���� ���� : " + intEvenCount);
		
		
	}
}
