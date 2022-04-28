package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class Exec3 {
	/*
	 * 정수형 리스트를 100개를 선언하고
	 * 각 요소에 1 ~ 100 까지의 임의의 정수 저장
	 * 각 배열 요소에 담긴 정수 중
	 * 55 이상의 정수들가 가장 첫번째로 나타난 경우를 찾아
	 * 위치와 값을 함께 출력
	 */

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();
		
		for(int i = 0; i < 100; i++) {
			nums.add((int)(Math.random() * 100) + 1);
		}
		
		for(int i = 0; i < nums.size(); i++) {
			if(nums.get(i) >= 55) {
				System.out.printf("%3d : %3d", i, nums.get(i));
				break;
			}
		}
		int index = 0;
		for(int num : nums) {
			if(num >=55) {
				System.out.println();
			}
		}
		
	}

}
