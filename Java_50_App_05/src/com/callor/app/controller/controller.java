package com.callor.app.controller;


import com.callor.app.service.ScoreService;

public class controller {

	public static void main(String[] args) {


		
		ScoreService scService = new ScoreService();
		
		scService.makeScore();
		scService.printScore();	
		scService.printSum();
		
				
				
			}
		}