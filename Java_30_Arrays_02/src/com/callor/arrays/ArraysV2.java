package com.callor.arrays;

public class ArraysV2 {
	public static void main(String[] args) {
		
		// �迭�� ������ 3���� �����ϸ� ÷��(index)�� �׻� �迭�� ���� - 1 ������
		// ������ ���� ���� �����Ѵ�
		// index < length : index �� length �� �׻� 0���� ū �����̴�
		int[] intNums = new int[3];
		intNums[0] = 10;
		intNums[1] = 20;
		intNums[2] = 30;
		
		// �迭�� ����(length)�� 3�ε� ÷��(index) 3���� ���� �����Ϸ���
		// �õ��� �ϸ� ArrayOutOfBound ����(exception, ����)�� �߻��Ѵ�.
		intNums[3] = 40;
		
	}
}
