package comcallor.classes.controller;

import comcallor.classes.service.ScoreServiceV2;

public class ScoreControllerV2 {

	public static void main(String[] args) {
		
		ScoreServiceV2 scoreServiceV2 = new ScoreServiceV2();
		int intResult = scoreServiceV2.input();
		if(intResult < 0) {
			System.out.println("�Է��� �ߴ��߽��ϴ�.");
		} else {
			System.out.println("�Է��� ��� �Ϸ��߽��ϴ�.");
		}
		
	}
}
