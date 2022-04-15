package com.callor.arryas.service;

import java.util.Scanner;

import com.callor.arryas.utils.Line;

public class StudentServiceV1 {
	
	protected String[] strStudents;
	protected Scanner scan;
	
	// �⺻ ������
	// Ŭ������ �����ϸ� �ڵ����� ����Ǵ� ������ �޼ҵ�
	public StudentServiceV1() {
		// strStudents = new String[10];
		// scan = new Scanner(System.in);
		/*
		 * strStudents, scan �� ���� ������ �ʱ�ȭ�� �Ǿ�� �ϴµ�
		 * �����ڿ� �ʱ�ȭ ��Ű�� �ڵ带 �ۼ��Ѵ�
		 * ������ ���� ServiceV1 Ŭ�������� �� ���� �����ڰ� �ִ�
		 * �׷��� �⺻ �����ڿ����� ���� �����ڿ��� ���� 10�� �����ϸ鼭
		 * strStudents �� scan �ΰ��� ������ �ʱ�ȭ �ϵ���
		 * toss �� ������.
		 */
		this(10); 
	}
	
	// ���� ������
	// Ŭ���� �����ڰ� �ʿ信 ���� ���Ƿ� �����ϴ� ������ �޼ҵ�
	// ���� �����ڸ� ���� �� �⺻ �����ڰ� �ʿ������ ���� ������ �Ѵ�.
	public StudentServiceV1(int length) {
		strStudents = new String[length];
		scan = new Scanner(System.in);
	}
	
	public int inputStudent() {
		System.out.println(Line.dLine(50));		
		System.out.println("�л��̸� �Է�");
		System.out.println(Line.sLine(50));
		for(int i = 0; i < strStudents.length ; i++) {
			
			System.out.printf("%d �� �л��̸� > ", i+1);
			String strName = scan.nextLine();			
			strStudents[i] = strName;
			
			this.printStudent();
			System.out.println(Line.sLine(50));
			
		}
		System.out.println("�Է��� ���� �Ǿ���~~");
		System.out.println(Line.dLine(50));
		return 0;
	}
	public void printStudent() {
		for(int i = 0 ; i < strStudents.length; i++) {
			boolean bYes = strStudents[i] == null;
			if(bYes) {
				break;
			}
			System.out.printf("** %s\t", strStudents[i]);
		}
		System.out.println();
	}
	
}
