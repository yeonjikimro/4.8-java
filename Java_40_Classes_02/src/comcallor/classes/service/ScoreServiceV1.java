package comcallor.classes.service;

import java.util.Scanner;

import comcallor.classes.utils.Line;

public class ScoreServiceV1 {

	protected String[] student;
	protected int[] intKor;
	protected Scanner scan;
	protected int lineLength;

	public ScoreServiceV1() {
		this(10);
	}

	public ScoreServiceV1(int length) {
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
				break;
			}
			System.out.print("����(������, END:�ߴ� >>");
			String strKor = scan.nextLine();
			if (strKor.equals("END")) {
				break;
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

		/*
		 * �Է��� �迭�� ������ŭ ��� ��ġ�� ���� �����ϸ� 0�� return 
		 * �Է� ���� END �� �Է��Ͽ� �ߴ��Ͽ����� -1 �� return
		 */
		if( index < student.length) { // ���߿� END �� �Է���
			return -1;
		} else { // ��� �Է� ��
			return 0;
		}
	}
}
