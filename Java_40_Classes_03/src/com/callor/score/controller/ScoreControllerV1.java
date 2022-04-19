package com.callor.score.controller;

import com.callor.score.service.ScoreServiceV1;

public class ScoreControllerV1 {

	public static void main(String[] args) {
		
		String[] stNames = {"홍길동", "이몽룡", "성춘향", "임꺽정", "장영자" };
		ScoreServiceV1 scService = new ScoreServiceV1(stNames);
		scService.makeScore();
		scService.printScore();
		scService.sumScore();
	}
}
// 각 과목의 총점과 평균을 출력하시오.