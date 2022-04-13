package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

public class ScoreServiceV4 {
	
	
	/*
	 * �ν��Ͻ� ���� (Ŭ���� ������ ����� ����)
	 * �ν��Ͻ������� ���𹮸� �ְ� �ʱ�ȭ �ڵ�� ����
	 * �ν��Ͻ������� Ŭ������ ������ �޼��忡�� ������ �ʱ�ȭ �Ѵ�
	 * �ν��Ͻ������� �迭�� ���
	 * 		�������Ű������� �ִ� �����ڸ� �����Ͽ�
	 * 		�����Ǵ� �迭�� ������ Controller ���� ������ �� �ִ�.
	 * 
	 * �̷��� ������ Service Ŭ������ �ڵ� ������ �ּ�ȭ �Ͽ�
	 * 		�������� ������ ������ �� �ִ�.
	 */
	private int[] intKor;
	
	public ScoreServiceV4() {
		intKor = new int[100]; // �������Ű������� �ִ� ������ ����
		
	}
	public ScoreServiceV4(int length) {
		intKor = new int[length];
		
	}
	// ScoreServiceV1 ���� ������ �ڵ�
	public void makeScore() {
		for(int i = 0; i < intKor.length; i++) {
			intKor[i] = (int)(Math.random() * 50) + 51 ;
		}
	}
	
	// ScoreServiceV2 ���� ������ �ڵ�
	public void printScore() {

		System.out.println(Line.dLine(50));
		System.out.println("���� ���� �϶�ǥ");
		System.out.println(Line.sLine(50));
		
		for(int i = 0; i < intKor.length; i++) {
			System.out.printf("%d : %d\t\t", (i+1), intKor[i]);
			if( (i+1) % 5 == 0) {
				System.out.println();
			}
		}
	}
}
