package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class Exec11 {
	/*
	 * 정수형 리스트를 100개를 선언하고
	 * 각 요소에 1 ~ 100 까지의 임의의 정수 저장
	 * 각 배열 요소에 담긴 정수 중
	 * 55 이상의 정수들 리스트 전체 출력
	 */

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		for(int i = 0; i < 100; i ++) {
			nums.add((int)(Math.random() * 100) + 1);
		}
		for(int num : nums) {
			if(num >= 55) {
				System.out.println(num);
			}
		}
	}

}
