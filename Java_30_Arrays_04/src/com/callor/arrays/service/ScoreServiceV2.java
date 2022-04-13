package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

public class ScoreServiceV2 {

	// ������ private : pakage������ public, �ٸ� pakage ������ private ����
	int[] intKor; // ���� �� ������ �迭

	public ScoreServiceV2() {
		intKor = new int[100]; // intKor �迭�� �����(����, �б�) �غ� �ȴ�. ����
	}
	
	public void makeScore() {
		for(int i = 0; i < intKor.length; i++) {
	
			intKor[i] = (int)(Math.random() * 50) + 51 ;
		}
	}
	
	public void printScore() {
		
		/*
		 * Line Ŭ������ ����� dLine() method �� static �̱� ������
		 * Line Ŭ������ line �ν��Ͻ��� ����� line.dLine ó�� ������ �ʿ䰡 ����.
		 * Line line = new Line();
		 * System.out.println(line.dLine);
		 */
		
		/*
		 * Line Ŭ������ static ���� ����� dLine() ����
		 * ���� ���� �����ϰ�, ���� ������ŭ ���� ���ڿ���
		 * return �޴´�
		 */
		System.out.println(Line.dLine(50));
		System.out.println("���� ���� �϶�ǥ");
		System.out.println(Line.sLine(50));
		
		for(int i = 0; i < intKor.length; i++) {
			System.out.printf("%d : %d\t\t", (i+1), intKor[i]);
			if( (i+1) % 5 == 0) {
				System.out.println();
			}
		}
		// main�� ���� ����� ���� ����
		System.out.println(Line.dLine);
	}

}
