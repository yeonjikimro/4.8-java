package com.callor.arrays;

public class ArraysV3 {

	public static void main(String[] args) {

		int[] intNums = new int[5];
		int index = 0;

		// index ������ ���� 0 �̹Ƿ� intNums[0] �� ���� �ڵ尡 �ȴ�.
		// index ��� ������ ����Ͽ� ÷�ڸ� ���������ν� �ݺ��Ǵ� �ڵ尡 ��������� �ܼ��� �ڵ尡 �����Ǿ���.
		intNums[index++] = (int) (Math.random() * 100) + 1;
		intNums[index++] = (int) (Math.random() * 100) + 1;
		intNums[index++] = (int) (Math.random() * 100) + 1;
		intNums[index++] = (int) (Math.random() * 100) + 1;
		intNums[index++] = (int) (Math.random() * 100) + 1;

		// index ���� 0���� 1�� ������Ű�鼭 5 �̸��� ���� {} �� �ڵ带 �����Ѵ�.
		for (index = 0; index < 5; index++) {
			intNums[index] = (int) (Math.random() * 100) + 1;
		}

		// 100�� ������ ������ �迭�� ����
		int[] intScore = new int[100];
		// 100���� �迭�� ���� 1 ~ 100���� ������ �����Ͽ� �����ϱ�
		// 100���� �׽�Ʈ�� ����� ���� �����͸� �������.
		for (index = 0; index < 100; index++) {
			intScore[index] = (int) (Math.random() * 100) + 1;
		}

		/*
		 * �� �ڵ忡�� ���� �������� ������ 200���� ����(new int[200]) ���� �� for() ��ɹ��� index < 100 �� index
		 * < 200 ���� ������ �־�� �Ѵ� ���� for() ��ɹ��� �ڵ带 �������� ������ �׽�Ʈ �������� ������ �ø� ȿ���� ��������.
		 * 
		 * �迭�� ������ ������ ������ �ڵ带 �߰��� �����ϴ� ������ ���ֱ� ���� �ڹٿ����� �迭�� ũ��� ���õ� ���� �Ӽ��� ������ �ξ���.
		 * �迭.length �Ӽ��� �迭�� ������ ��� �ִ� Ư���� �����̴�. �迭.length �� �迭�� �����ϸ� �迭�� ������ �ڵ����� �����ϵ���
		 * �ڵ����� ��������� Ư���� �����̴�.
		 * 
		 * ����� �迭.toString() : �迭�� �޼���, �迭.length : �迭�� �Ӽ�
		 */

		// length : �Ӽ�
		for (index = 0; index < intScore.length; index++) {

			intScore[index] = (int) (Math.random() * 100) + 1;
		}

		int intSum = intScore[0];
		intSum += intScore[1];
		intSum += intScore[2];
		System.out.println(intSum);

		intSum = 0;

		// intScore �迭�� 0 ������ intScore.length - 1 �������� ������ ��� �ջ��Ͽ�
		// intSum �� ���, console �� ���

		for (index = 0; index < intScore.length; index++) {

			intSum += intScore[index];
		}

		System.out.println("���� : " + intSum);

		// ����� ����Ͽ� console �� ���
		// ��� ����� �Ҽ������� ǥ���ϰ� ������ �� �����͸� ���� �Ǽ������� ���� �� ��ȯ �� �Ŀ� ������ �ϰ� ����� �Ǽ��� ������ �����ϸ� �ȴ�.
		float floatAvg = (float)intSum / (float)intScore.length;
		System.out.println(floatAvg);
	
	}
		
		
}