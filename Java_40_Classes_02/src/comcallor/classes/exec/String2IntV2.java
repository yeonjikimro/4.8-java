package comcallor.classes.exec;

public class String2IntV2 {

	public static void main(String[] args) {
		
		String strNum = "";
		int intNum = 0;
		if(strNum.equals("")) {
			System.out.println("���ڷ� ��ȯ�� �� ����");
		} else {
			intNum = Integer.valueOf(strNum);
		}
		
		/*
		 * ���� Ű���� ���� ����Ͽ� ���� �Է��� ���
		 * �����߿� space Ű�� ���� white space �� ���� ��찡
		 * �߻��� ���̴�
		 * space Ű�� �ѹ�, �ι�, ������ �Է��Ѵٰ� ������ ���
		 * ��� ����� ���� if()�� ����Ͽ� �˻��Ѵٸ�
		 * ���� ���ʿ��� �ڵ尡 �߰��Ǿ�� �� ���̴�.
		 */
		if(strNum.equals("  ")) {
			System.out.println("space �� ���ڷ� ��ȯ�� �� ����");
		}
		
		
		
		
	}
}
