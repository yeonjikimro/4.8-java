package com.callor.arrays.exec;

/*
 * ������ �迭 100���� �����ϰ�
 * Math.random() �� ����Ͽ� 1 ~ 100���� ������ ����
 * �����ϰ� �� ��ҿ� ����
 * �迭�� �� ��ҿ� ����� �� �߿���
 * ¦���� ����Ʈ�� �� ���ο� 5���� ��� ����Ͻÿ�
 */
public class ExecV6A {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		for(int i = 0; i < intNums.length ; i++) {
			intNums[i] = (int)(Math.random() * 100 ) + 1;
		}
		/*
		 * ¦���� 5�� ����ϰ� Enter �� ����Ͽ� �ٹٲ��ϱ�
		 * i ������ ����Ͽ� Ƚ���� �����ϸ� Ȧ���� ��, ¦���� �� �������
		 * i �������� ��ȭ�� �ϱ� ������ ������ �߻��Ѵ�
		 * 
		 * ¦���� ����� ������ ����� Ƚ���� ������ ������ �ʿ��ϴ�
		 * ������ ¦���� ����� ������ ����� Ƚ���� ������ ������ 
		 * for() ��ɹ� ������ ������ ���־�� �Ѵ�.
		 */
		int intEvenPrintCount = 0;
		for(int i = 0; i < intNums.length; i++) {
			boolean bEven = intNums[i] % 2 == 0;
			if(bEven) {
				System.out.printf("%d\t",intNums[i]);
				// ¦���� ����� �� ����� Ƚ���� 1 ������Ű����
				intEvenPrintCount ++;
				
				// ¦���� ����� Ƚ���� 5�� �Ǹ� �ٹٲ�(println() ) �Ѵ�
				if(intEvenPrintCount % 5 == 0 ) {
					System.out.println();
				}
			}
		}
	}

}
