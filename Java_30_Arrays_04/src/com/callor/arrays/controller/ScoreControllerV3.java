package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV3;

public class ScoreControllerV3 {

	public static void main(String[] args) {
		ScoreServiceV3 scServiceV3 = new ScoreServiceV3();
		scServiceV3.printNo1Score();
		
		/*
		 *  ScoreServiceV3 �� ����� intKor �迭��
		 *  private ���� �����ڰ� �����Ǿ� �ֱ� ������
		 *  �ν��Ͻ��� ���Ͽ� �迭�� ������ �� ����.
		 *  (���� ScoreServiceV3 ������ ���� �� �ִ�.)
		 */
		// scServiceV3.intKor[1] = 100;
		scServiceV3.printNo1Score();
	}
}
