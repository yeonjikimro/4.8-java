package com.callor.arrays.exec;

public class ExecV5 {
	public static void main(String[] args) {
		
	// 1 ~ 100까지 수를 덧셈하여 출력
		
		int intSum = 0;
		// for 문에서 비교문은 딱 떨어지는 수를 주는게 좋다 i<101(x)
		for(int i = 0; i < 100; i++) {
			
			intSum += (i + 1);
		}
		
		System.out.println(intSum);

	}
}

