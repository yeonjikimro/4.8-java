package com.callor.arrays.exec;

public class ExecV2 {
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		

		int index = 0;
		int intEven = 0;
	
		/*
		 * ������ �迭 100���� �����ϰ� Math.random()�� ����Ͽ�
		 * 1~100���� ������ ���� �����ϰ� ���� ��ҿ� ����
		 * �迭�� �� ��ҿ� ����� ���� ¦���ΰ� �ƴѰ��� �Ǻ��Ͽ� ����Ͻÿ�
		 */
		
		// for() ��ɹ��� ����ο��� ������ �����ϸ�
		// for() { } �� ���� �� ������ �Ҹ�ȴ�
		// ���� method ������ ���� �̸��� ������ ������ �� �ִ�.
		
		for(int i = 0; i < intNums.length ; i++) {
			intNums[i] = (int)(Math.random() + 100) + 1;
		}
		
		for(int i = 0; i < intNums.length ; i++) {
			boolean bEven = (intNums[i] % 2) == 0;
			if(bEven) {
				System.out.printf("\t%d��(��) ¦��\n", intNums[i]);
			} else {
				System.out.printf("\t%d ��(��) ¦���� �ƴ�\n", intNums[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		// ���� �� ��
		
		for (index = 0 ; index < intNums.length ; index++) {			
			intNums[index] = (int)(Math.random() * 100) + 1;			
			intEven = intNums[index];
		}
		
		for (intEven = 0 ; intEven < intNums.length ; intEven++) {
			
			if (intEven % 2 == 0) {
				System.out.println(intEven + "��(��) ¦���̴�");
			} else {
				System.out.println(intEven + "��(��) ¦���� �ƴϴ�");
			}
		}
		
		
		
		
	}
}
