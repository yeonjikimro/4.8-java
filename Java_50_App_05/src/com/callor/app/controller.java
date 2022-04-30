package com.callor.app.controller;


import com.callor.app.service.ScoreService;

public class controller {

	public static void main(String[] args) {

		int size = 20;
		
		ScoreService scService = new ScoreService(size);
		
		scService.printScore();	
		scService.printSum();
		
				
				
			}
		}
