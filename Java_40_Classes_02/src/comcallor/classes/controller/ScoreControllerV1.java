package comcallor.classes.controller;

import comcallor.classes.service.ScoreServiceV1;

public class ScoreControllerV1 {

	public static void main(String[] args) {
		
		ScoreServiceV1 sV1 = new ScoreServiceV1(3);
		
		int intResult = sV1.input();
		if(intResult < 0) {
			System.out.println("�Է� ���� �ߴ���");
		} else {
			System.out.println("�Է��� ��� ��ħ");
		}
	}
}
