package com.callor.arryas.controller;

import com.callor.arryas.service.StudentServiceV1;

public class StudentController {
	
	public static void main(String[] args) {
		
		// �⺻�����ڸ� ȣ���Ͽ� �ν��Ͻ� ����
		StudentServiceV1 stService10 = new StudentServiceV1();
		
		// ���ǻ����ڸ� ȣ���Ͽ� �ν��Ͻ� ����
		StudentServiceV1 stService = new StudentServiceV1(5);
		
		stService.inputStudent();
		stService.printStudent();
		
	}
}
