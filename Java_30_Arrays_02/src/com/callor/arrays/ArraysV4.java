package com.callor.arrays;

public class ArraysV4 {
	
	public static void main(String[] args) {
		
		int index = 0;
		for(index = 0; index < 10 ; index++) {
			System.out.println(index);
		}
		
		/*
		 * for() ��ɹ� ���ο��� index ������ ���Ǵ� ������
		 * Ư���� ��찡 �ƴϸ� for() ��ɹ��� ���� �� �ʿ䰡 ���� �����̴�
		 * �׷��� ���� for() ��ɹ��� �ʱ�ȭ �������� ������ �����Ѵ�
		 * �̷��� �ϸ� �Ʒ����� ���� i �� for() {} ������ �ڵ����� �Ҹ�ǰ�
		 * �����ġ���� clear �ȴ�.
		 * 
		 * for() ��ɹ��� �ʱ�ȭ �������� ������ ����� ������ ���� �Ѵ�
		 */
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
		}
		
	}
}
