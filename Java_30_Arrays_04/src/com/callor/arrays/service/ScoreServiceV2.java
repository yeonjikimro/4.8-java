package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

public class ScoreServiceV2 {

	// 제한적 private : pakage에서만 public, 다른 pakage 에서는 private 역할
	int[] intKor; // 선언만 된 정수형 배열

	public ScoreServiceV2() {
		intKor = new int[100]; // intKor 배열이 사용할(저장, 읽기) 준비가 된다. 생성
	}
	
	public void makeScore() {
		for(int i = 0; i < intKor.length; i++) {
	
			intKor[i] = (int)(Math.random() * 50) + 51 ;
		}
	}
	
	public void printScore() {
		
		/*
		 * Line 클래스에 선언된 dLine() method 는 static 이기 때문에
		 * Line 클래스를 line 인스턴스로 만들고 line.dLine 처럼 접근할 필요가 없다.
		 * Line line = new Line();
		 * System.out.println(line.dLine);
		 */
		
		/*
		 * Line 클래스에 static 으로 선언된 dLine() 에게
		 * 정수 값을 전달하고, 정수 개수만큼 라인 문자열을
		 * return 받는다
		 */
		System.out.println(Line.dLine(50));
		System.out.println("국어 성적 일람표");
		System.out.println(Line.sLine(50));
		
		for(int i = 0; i < intKor.length; i++) {
			System.out.printf("%d : %d\t\t", (i+1), intKor[i]);
			if( (i+1) % 5 == 0) {
				System.out.println();
			}
		}
		// main이 없어 출력을 하지 못함
		System.out.println(Line.dLine);
	}

}
