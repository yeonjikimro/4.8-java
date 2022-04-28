package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class Exec2 {
	/*
	 * 정수형 리스트를 100개를 선언하고
	 * 각 요소에 1 ~ 100 까지의 임의의 정수 저장
	 * 각 배열 요소에 담긴 정수 중
	 * 55 이상의 정수들 리스트와 위치(요소) 전체 출력
	 */

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>(); 
		for(int i = 0; i<100 ; i ++ ) {
			nums.add( (int)(Math.random() * 100 ) + 1);
		}
		int index = 0;
		for(int num:nums) {
			if(num >= 55) {
				System.out.printf("\t%3d : %3d\n", index, num);
			}
			index++;
		}
		
		/*
		 * int size = nums.size(); 
		 * for(int i = 0 ; i < size ; i++) {
		 *  if(nums.get(i) >= 55) { 
		 * 	    System.out.printf("\t%3d : %3d\n", i, nums.get(i)); 
		 *    } 
		 * }
		 */
	}

}
