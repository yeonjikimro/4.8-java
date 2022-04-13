package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV4;

public class ScoreControllerV4 {
	
	public static void main(String[] args) {
		ScoreServiceV4 scoreServiceV4 = new ScoreServiceV4(150); //생성되는 배열의 개수를 Controller 에서 설정할 수 있다.
		scoreServiceV4.makeScore();
		scoreServiceV4.printScore();
		
		}
}
