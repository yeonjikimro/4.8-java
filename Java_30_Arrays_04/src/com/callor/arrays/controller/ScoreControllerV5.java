package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV5;

public class ScoreControllerV5 {

	public static void main(String[] args) {
		ScoreServiceV5 scoreServiceV5 = new ScoreServiceV5(1);
		System.out.println("성적일람표");
		scoreServiceV5.makeScore();
		scoreServiceV5.printScore();
		System.out.println("==========================");
		scoreServiceV5.sumScore();
		
		
	}
}
