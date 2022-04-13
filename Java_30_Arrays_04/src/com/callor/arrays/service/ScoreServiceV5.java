package com.callor.arrays.service;

/*
 * makeScore()
 * printScore()
 * sumScore()
 * 등의 method 를 선언하고
 * 
 * 임의 성적을 생성하여 intKor 에 저장
 * 성적일람표 출력
 * 총점계산
 * 
 */
public class ScoreServiceV5 {

	private int[] intKor;
	
	public ScoreServiceV5(int count) {
		intKor = new int[count];
		
	}

	int intFirst = 0;
	public void makeScore() {
		for(int i = 0; i < intKor.length; i ++) {
			intKor[i] = (int)(Math.random() * 50) + 51;
			intFirst += intKor[i];
			System.out.println("1학년 성적 : " + intKor[i]);
		}
	}
	int intSec = 0;
	public void printScore() {
		for(int i = 0; i < intKor.length; i ++) {
			
			intKor[i] = (int)(Math.random() * 50) + 51;
			intSec += intKor[i];
			System.out.println("2학년 성적 : " + intKor[i]);
		}
	}
	int intSum = 0;
	int i = 0;
	public void sumScore() {
			
			intSum = intFirst;
			intSum += intSec;
			System.out.println("성적 총점 : " + intSum);
		}
	}
	

