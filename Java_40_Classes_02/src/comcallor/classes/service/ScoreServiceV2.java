package comcallor.classes.service;

import java.util.Scanner;

import comcallor.classes.utils.Line;

public class ScoreServiceV2 {

	protected String[] student;
	protected int[] intKor;
	protected Scanner scan;
	protected int lineLength;

	public ScoreServiceV2() {
		this(10);
	}

	public ScoreServiceV2(int length) {
		student = new String[length];
		intKor = new int[length];
		scan = new Scanner(System.in);
		lineLength = 50;
	}

	public int input() {

		System.out.println(Line.dLine(lineLength));
		System.out.println("���� �� ����ó�� V2");
		System.out.println(Line.sLine(lineLength));
		int index = 0;

		while (index < student.length) {
			System.out.print("�̸�(END:�ߴ�) >> ");
			String strName = scan.nextLine();
			index++;

			if (strName.equals("END")) {
				return -1;
			}
			System.out.print("����(������, END:�ߴ� >>");
			String strKor = scan.nextLine();
			if (strKor.equals("END")) {
				return -1;
			}

			int intScore = 0;
			try {
				// exception �� �߻��� �� �ִ� �ڵ�
				intScore = Integer.valueOf(strKor);
				student[index] = strName;
				intKor[index] = intScore;
				index++;

			} catch (Exception e) {
				System.out.println("�Է��� �� \"" + strKor + "\"�� ������ ���� �Ұ�~~");
				System.out.println("������ �����θ� �Է��ϼ���");
			}
		}

	
			return 0;
	}
}
