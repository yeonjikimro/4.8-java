package comcallor.classes.controller;

import comcallor.classes.service.ScoreServiceV3;

public class ScoreControllerV3 {

	public static void main(String[] args) {
		
		ScoreServiceV3 scServiceV3 = new ScoreServiceV3();
		scServiceV3 = new ScoreServiceV3(20);

		// String[] strNames = new String[5];
		// strNames[0] = "ȫ�浿";
		// strNames[1] = "�̸���";
		// strNames[2] = "������";
		// strNames[3] = "�Ӳ���";
		// strNames[4] = "�庸��";
		String[] strNames = { "ȫ�浿", "�̸���", "������", "�Ӳ���", "�庸��" };
		
		scServiceV3 = new ScoreServiceV3(strNames);
		
	}
}
