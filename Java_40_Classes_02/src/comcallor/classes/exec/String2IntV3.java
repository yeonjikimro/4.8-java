package comcallor.classes.exec;

import java.util.Scanner;

public class String2IntV3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� >> ");
		String strNum = scan.nextLine();
		int intNum = 0;
		try {
			intNum = Integer.valueOf(strNum);
			boolean bEven = intNum % 2 == 0;
			if(bEven) {
				System.out.printf("\t���� %d �� ¦��\n", intNum);
			} else {
				System.out.printf("\t���� %d �� ¦���� �ƴ�\n, intNum");
			}
		} catch (Exception e) {
			
			System.out.println("�Է��� ���ڿ��� ���ڷ� ������ �� ����");
		}
		
		
		
	}
}
