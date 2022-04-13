package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

public class ScoreServiceV1 {
	
	/*
	 *  Ŭ���� ������ ����� ����
	 *  ScoreServiceV1 Ŭ������ ����� ��� method����
	 *  ������ ����(�а�, ����) �� �� �ִ�
	 *  
	 *  �ν��Ͻ� ���� :
	 *  ScoreServiceV1 Ŭ������ ����Ͽ� �ν��Ͻ��� ������ ��
	 *  (�ڵ�����) �ʱ�ȭ �Ǵ� �ڵ�
	 */
	int[] intKor; // ���� �� ������ �迭
	
	/*
	 * ScoreServiceV1 Ŭ������ �ʱ�ȭ�� ������ �޼��� ����
	 * 		������ �޼���� Ŭ������ �����ϸ�
	 * 		Ŭ���� ��( {} ) ���ο� �ڵ����� ����ȴ�.
	 * 		�ڵ����� ����� ������ �޼���� �ڵ� �󿡴� ������ �ʴ´�
	 * ���Ƿ� ������ �޼��带 �����ϴ� ����
	 * 		1. Ŭ���� ������ ����� ������ �ʱ�ȭ�Ͽ� ����� �� �ֵ���
	 * 			�غ��ϴ� �ڵ带 �����Ѵ�
	 */
	public ScoreServiceV1() {
		intKor = new int[100]; // intKor �迭�� �����(����, �б�) �غ� �ȴ�.
	}
	
	public void makeScore() {
		for(int i = 0; i < intKor.length; i++) {
			/*
			 * random() * 50 �� �����ϸ� 0 ~ 49���� ������ ������ ���� �����ȴ�.
			 * ���⿡ +51 �� �ϸ� 0�϶��� 51, 49�϶��� 100�� ����� �����ȴ�.
			 * �׷��� 51~100������ �������� ������ ���� �����ϴ� �ڵ�
			 */
			intKor[i] = (int)(Math.random() * 50) + 51 ;
		}
	}
	
	public void printScore() {
		
		/*
		 * Line Ŭ������ ����� dLine �Ӽ�(����)�� static �̱� ������
		 * Line Ŭ������ line �ν��Ͻ��� ����� line.dLine ó�� ������ �ʿ䰡 ����.
		 * Line line = new Line();
		 * System.out.println(line.dLine);
		 */
		
		/*
		 * dLine �Ӽ�(����)�� static ���� ����Ǿ� �ֱ� ������
		 * Line Ŭ������ �ν��Ͻ��� �������� �ʰ� ������ �� �ִ�
		 */
	//	Line.dLine = "*".repeat(100);
		System.out.println(Line.dLine);
		System.out.println("���� ���� �϶�ǥ");
		System.out.println(Line.sLine);
		
		for(int i = 0; i < intKor.length; i++) {
			System.out.printf("%d\t", intKor[i]);
			if( (i+1) % 5 == 0) {
				System.out.println();
			}
		}
		// main�� ���� ����� ���� ����
		System.out.println(Line.dLine);
	}

}
