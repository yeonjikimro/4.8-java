package com.callor.app.service.impl;

import com.callor.app.service.ScoreService;

public class ScoreControllerV4 {

	public static void main(String[] args) {
		ScoreService scService = new ScoreServiceImplV4();
		scService.inputScore();
		scService.saveScore();
	}
}
