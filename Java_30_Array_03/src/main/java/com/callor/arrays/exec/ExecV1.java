package com.callor.arrays.exec;

public class ExecV1 {
	public static void main(String[] args) {
		
		String strName = "";
		int intNum1 = 0;
		intNum1 = (int) (Math.random() * 100) + 1;

		System.out.println(intNum1);
		
		boolean bEven = false;
		// intNum1 ������ 2�� ���� �������� 0�̳�
		// intNum1 ������ ��� ���� 2�� ���� �������� 0�̳�
		// 0�̸� true�� bEven�� ����, �ƴϸ� false �� bEven ����ȴ�.
		bEven = (intNum1 % 2) == 0;
		
		if (bEven) {
			System.out.println(intNum1 + "��(��) ¦���̴�");
		} else {
			System.out.println(intNum1 + "��(��) ¦���� �ƴϴ�");
		}

	}
}
