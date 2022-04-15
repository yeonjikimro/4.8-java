package com.callor.arryas.service;

import java.util.Scanner;

import com.callor.arryas.utils.Line;

/*
 * 
 * ServiceV2 ���� ServiceV1 �� ��ӹ޾Ҵ�
 * ����� ������ ServiceV1 �� ����� ����, method �� �״�� �����޴´�.
 * ��, ������ ����
 * 
 * ��� Ű���尡 extends(Ȯ��) �� �Ϳ� �ָ�!!
 * 
 */

public class StudentServiceV2 extends StudentServiceV1{

	
	// �⺻ ������
	public StudentServiceV2() {
		this(10); 
	}
	
	// ���� ������
	public StudentServiceV2(int length) {
		strStudents = new String[length];
		scan = new Scanner(System.in);
	}
	/*
	 * Override(������)
	 * ServiceV1 �� ����� �޼ҵ� �߿���
	 * inputStudent �޼��带 �ٽ� �����ϰڴ�.
	 */
	@Override
	public int inputStudent() {

		System.out.println(Line.dLine(50));
		System.out.println("�л����� �Է� v2");
		System.out.println(Line.sLine(50));
		
		int index = 0;
		for(index = 0; index < strStudents.length; index++) {
			System.out.printf("%d �� �л��Է�(QUIT : �ߴ� > ", index+1);
			String strName = scan.nextLine();
			if(strName.equals("QUIT")) {
				break;
			}
			strStudents[index] = strName;
		}
		/*
		 * for() �� ���۵Ǳ� ���� ����� index�� for() {} ����Ǿ
		 * ���� �����ϰ� �ִ�.
		 * 
		 * ���� for() ��ɹ��� ��� ������� �ʰ� �ߴܵǸ�
		 * 
		 * index < strStudents.length
		 */
		if(index < strStudents.length) {
			System.out.println("�Է��� �ߴܵǾ����ϴ�.");
		} else {
			System.out.println("�Է��� ��� ���ƽ��ϴ�");
		}
				
		if(index >= strStudents.length) {
			System.out.println("�Է��� ��� ���ƽ��ϴ�");
		} else {
			System.out.println("�Է��� �ߴܵǾ����ϴ�");
		}
		
		// System.out.println("index :" + index);
		// System.out.println("����");		
		return 0;
		
	}
	
	
	
}