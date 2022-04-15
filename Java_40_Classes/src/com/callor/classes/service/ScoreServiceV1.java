package com.callor.classes.service;

import java.util.Scanner;

import com.callor.classes.utls.Line;

public class ScoreServiceV1 {
	/*
	 * ����� ���ο� �ΰ� Ŭ������ ������ ����
	 * �ν��Ͻ��������� private �� �ƴ� protected �� �����Ѵ�
	 * protected :
	 * private �� ������ �����鼭
	 * ��ӹ��� Ŭ�������� ��ӹ޾� ������ ������ �Ͱ� ���� ȿ���� ����.
	 * �ν��Ͻ������� ����� �ȴ�.
	 * 
	 * private �� ��ӹ��� ������ �� �� ����.
	 */
	protected String[] students;
	protected int[] intKor;
	protected int lineLength;
	protected Scanner scan;
	
	
	public ScoreServiceV1() {
		this(10);
	}
	public ScoreServiceV1(int length) {
		students = new String[length];
		intKor = new int[length];
		lineLength = 50;
		scan = new Scanner(System.in);
				
	}
	public int input() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("������ �� ����ó�� v1");
		System.out.println(Line.sLine(lineLength));
		
		int index = 0;
		for(index = 0; index < students.length; index++) {
			int stNum = index + 1;
			System.out.printf("%d �� �л� �̸�(END:�ߴ�) : ", index + 1);
			
			// Ű���忡�� ���ڿ� �Է¹ޱ�
			String strName = scan.nextLine();
			
			/*
			 * �迭�� �л��̸��� �����ϴ� �ڵ尡 if() ���� �ִ�
			 * �̷��� �Ǹ�  for() ���� �ߴܵǱ� ���� END ���ڿ��� 
			 * students[index]�� ����ȴ�.
			 * �� students[index] = "END" �� ����ȴ�.
			 */
			// students[index] = strName;
			
			// �̸���� END ���ڿ��� �Է��ϸ� �Է¹ޱ⸦ �ߴ��Ѵ�.
			if(strName.equals("END")) {
				break;
			}
			// �л��̸��� �迭�� ������ ���� if() ������ ��ġ�ؾ� �Ѵ�
			// ���� if() ���� �ڵ带 ��ġ�ϸ�, �ߴܵǱ� ���� students[index] ��ҿ� END ���ڿ��� ���� ����Ǳ� ������
			// �л� �̸��� END �� ��Ÿ�� ���̴�.
			students[index] = strName;
			
			System.out.printf("%d �� �������� : >", stNum);
			// int intScore = scan.nextInt();
			// intKor[index] = intScore;
			String strScore = scan.nextLine();
			int intScore = 0;
			if(strScore.equals("")) {
				System.out.println("������ ���ڸ� ����~~");
			} else {
				intScore = Integer.valueOf(strScore);
			}
			intKor[index] = intScore;
		}

		return 0;
	}
	
	public void print() {
		for(int i = 0; i < students.length; i++) {
			System.out.printf("%s\t", students[i]);
		}
		System.out.println();
	}
	
	
	
	
	
}
