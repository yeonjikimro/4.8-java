package comcallor.classes.exec;

import java.util.Scanner;

public class String2IntV5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * �ݺ��Ǵ� Ƚ���� �������� �ʰ� � ���ǿ� ���� ������ �ݺ��Ǵ� �ڵ带 �ۼ��� ����
		 * for() �� ������� �ʰ� while() ����� ����Ѵ�
		 * () ���� ������ true �� ���� {} �� �ڵ带 ������ �ݺ��Ѵ�
		 */
		while (true) {			
			System.out.print("�����Է�(END:����) >> ");
			String strNum = scan.nextLine();
			if(strNum.equals("END")) {
				break;
			}
			
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
		} // end while
		System.out.println("GAME OVER!!!");
		
	}
}
