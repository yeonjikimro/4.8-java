package comcallor.classes.exec;

public class String2IntV1 {

	public static void main(String[] args) {
		
		
		/*
		 * ���ڿ��� ���ڸ� ������ ���ڷ� ����ȯ�ϱ�
		 */
		String strNum = "33";
		int intNum = Integer.valueOf(strNum);
		
		
		/*
		 * ���ڿ��� ���ڸ� �Ǽ�(float)�� ���ڷ� ����ȯ�ϱ�
		 */
		strNum = "33.2";
		float fNum = Float.valueOf(strNum);
		
		float fSum = intNum + fNum;
		System.out.println(fSum);
		
	}
}
