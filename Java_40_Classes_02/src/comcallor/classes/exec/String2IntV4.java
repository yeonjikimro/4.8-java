package comcallor.classes.exec;

import java.util.Scanner;

public class String2IntV4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		 * for() �� ����Ͽ� ���� �ݺ� ������ �ϸ鼭
		 * Ű���忡�� ���ڿ��� ���ڸ� �Է¹ް� ������ ���ڷ� �����Ͽ�
		 * ¦������ �Ǻ��Ͽ� ����ϱ�
		 */
		for( ;;) {			
			System.out.print("�����Է� >> ");
			String strNum = scan.nextLine();
			int intNum = 0;
			
			try {
				intNum = Integer.valueOf(strNum);
				boolean bEven = intNum % 2 == 0;
				if(bEven) {
					System.out.println(intNum + " �� ¦��");			
				}
			} catch (Exception e) {
				System.out.println("�Է��� \"" + strNum + "\"�� ���ڷ� ����Ұ�!!");			
			}
		}
		
	}
}
