package com.callor.arrays.exec;

public class ExecV4A {
	public static void main(String[] args) {
		
		
		// ¦������ ���� ���Ͻÿ�
		
		
		int[] intNum = new int[100];

		// for �� ���� int i = 0; ���������� for�� �ȿ����� �����ȴ�.
		for(int i = 0; i < intNum.length; i++) {
			intNum[i] = (int)(Math.random() * 100 ) + 1;
		}
		
		// ¦���� ���� ������ ������ ����
		int intSum = 0;
		for(int i = 0; i < intNum.length; i++) {
			boolean bEven = (intNum[i] % 2) == 0;
			if(bEven) {
				// intSum = intSum + intNum[i]
				intSum += intNum[i];
			}
		}
		System.out.println("¦������ ��: " + intSum);

	}
}
