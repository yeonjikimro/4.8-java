package com.callor.app.exec;

public class Exec7 {
	public static void main(String[] args) {

		int[] intNum = new int[100];
		int num = 0;

		for (int i = 0; i < intNum.length; i++) {

			intNum[i] = (int) (Math.random() * 100) + 2;
			intNum[i] = pf(num);
		}
		for(int i = 0; i < intNum.length; i++) {
			
			if (index < num) {
				return 0;
			} else {
				count++;
			}
		}
		
		
	}

	public static int pf(int num) {
		int index = 0;
		int count = 0;

		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				break;
			}

		}
		System.out.println(count);
		return count;
	

	}

}
