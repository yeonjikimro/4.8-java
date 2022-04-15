package com.callor.arryas.exec;

public class StringEx1 {

	public static void main(String[] args) {
		
		/*
		 * ���ڿ��� ������ ������, �Ҹ��� ������ ��������
		 * �ٸ���
		 * ������ ���ڿ��� ������ ����� ���ڿ��� EQ(==) �񱳸� �ϴ� ����
		 * �ſ� ������ �ڵ尡 �� �� �ִ�.
		 * 
		 * ���ڿ����� ������ ���� EQ(==) �Ǵ� Not EQ( != ) �� ����Ͽ�
		 * ������ �ʴ´�
		 */
		String strNation = "KOREA";
		System.out.println(strNation == "KOREA");
		
		String strName = new String("ȫ�浿");
		System.out.println(strName);
		System.out.println(strName == "ȫ�浿");
		
		System.out.println(strNation.equals("KOREA"));
		System.out.println(strName.equals("ȫ�浿"));
		
		boolean bYes = strNation.equals("KOREA");
		if(bYes) {
			System.out.println("strNation �������� \"KOREA\" �� ����ִ�");
		}
		bYes = strName.equals("ȫ�浿");
		
		strNation = "Republic of Korea";
		bYes = strNation.equals("republic of Korea");
		
		// �Ʒ��� �ڵ带 Chaining �� ����Ͽ� �� ������ ��ɹ����� �ϼ��ϱ�
		String upString = strNation.toUpperCase();
		bYes = upString.equals("REPUBLIC OF KOREA");
		
		// method Chaining
		bYes = strNation.toUpperCase().equals("REPUBLIC OF KOREA");
		bYes = strNation.toLowerCase().equals("reblic of korea");
		
		// ��ҹ��ڸ� �����ϰ� ���ڿ��� ���϶�
		// ��, ����� �������� �ʴ´�
		bYes = strNation.equalsIgnoreCase("rePublic OF KOREA");
		
		
		
	}
}
