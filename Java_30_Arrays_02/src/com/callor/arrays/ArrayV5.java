package com.callor.arrays;

public class ArrayV5 {
	public static void main(String[] args) {
		
		int[] intScore = new int[100];


		for(int i = 0; i < intScore.length; i++) {
			
			intScore[i] = (int)(Math.random() * 100) + 1;
			
		}
		
		/*
		 * intScore �迭�� ��� ���� for() ���� ����Ͽ�
		 * �� ��Һ��� ���ٷ� ���
		 * 5��° ��Ҹ� ����� �� Enter(new line, println() )�� �϶�
		 * i(index) ���� 5�� ���� �������� 0�� �� �� println() �� �����Ͽ� new line �� �ο��Ѵ�.
		 * �׷��� i ���� 0���� �����Ѵ� 0 % 5 �� ����� 0�� �Ǿ�
		 * ó�� ��Ҹ� ����� �� new line �� �Ǿ� ������
		 * �׷��� i+1 �� ���� �����Ͽ� index % 5 �� ������ 1���� �����ϵ��� �Ͽ� �ش�.
		 */
		for(int i = 0 ; i < intScore.length ; i++) {
			System.out.print(intScore[i] + ",\t");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
		
		// for() �ݺ��� �ڿ��� �ݵ�� {} �� �������
		// ��ɹ� ���� �����ݷ�(;) �� ���� ��ɹ��� ������
		
		for(int i = 0 ; i < 100000; i++);
		System.out.println("���ѹα�����");
		

	}
}
