package com.callor.app;

public class PamentEx1 {

	
	/*
	 * 급여를 현금으로 지급하려고 한다
	 * 대한민국 액면가률 기준으로 최소 화폐매수로 지급하려고 한다
	 * 급여 금액에 따라 최소 화폐매수 계산을 수행하기
	 * 
	 * 대한민국 화폐단위
	 * 5만, 1만, 5천, 1천, 5백, 1백, 50원, 10원
	 * 
	 */
	
	public static void main(String[] args) {

		int pay = 3_928_880 ;
		
		// 5만원권
		int paper = (pay / 50_000);
		System.out.println("5만원권 : " + paper);
		
		pay -= paper * 50_000; // 5만원권을 제외한 금액
		
		paper = (pay / 10_000);
		System.out.println("1만원권 : + paper");
		
		// 반복적으로 10원권까지 계산 수행하면 결과를 얻을 수 있다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int num = 351525800;
		int payment = 0;
		int omanCount = 0;
		int ocheonCount = 0;
		int cheonCount = 0;
		
		payment = num % 50000;
		System.out.println(payment);
		
		while(true) {
			payment /= 5;
			payment = ocheonCount;
			if(payment > 0) {
				payment /= 2;
			} 

		}

		}

	

}
