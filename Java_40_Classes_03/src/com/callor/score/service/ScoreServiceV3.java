package com.callor.score.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.score.utils.Line;
import com.callor.score.utils.Score;

public class ScoreServiceV3 extends ScoreServiceV1{

	
	// 배열을 이용하여 ServiceV2 작성하기
	
	
	
	protected final static int I_KOR = 0;
	protected final static int I_ENG = 0;
	protected final static int I_MATH = 0;
	protected final static int I_TOTAL = 0;
	protected final static int I_AVG = 0;

	public ScoreServiceV3() {
		this(10);
	}

	public ScoreServiceV3(int length) {

		scores = new ScoreV2VO[length];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}
	}

	// 학생 이름 리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV3(String[] stNames) {

		int length = stNames.length;
		scores = new ScoreV2VO[length];
		for (int i = 0; i < length; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName(stNames[i]);
		}
	}


	public void printScore() {
		
		float[] totals = new float[5];
		
		System.out.println(Line.dLine(50));
		System.out.println("빛나고교 성적표 v1");
		System.out.println(Line.sLine(50));
		System.out.println("이  름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));

		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%-3s\t",scores[i].getStName());
			System.out.printf("%4d\t",scores[i].getIntKor());
			System.out.printf("%4d\t",scores[i].getIntEng() );
			System.out.printf("%4d\t",scores[i].getIntMath());
			System.out.printf("%6d\t",scores[i].getIntSum());
			System.out.printf("%4.2f\n", scores[i].getfAvg());
			
			totals[I_KOR] += scores[i].getIntKor();
			totals[I_ENG] += scores[i].getIntEng();
			totals[I_MATH] += scores[i].getIntMath();
			totals[I_TOTAL] += scores[i].getIntSum();
			/*
			 * 평균계산 주의
			 */
			totals[I_AVG] += scores[i].getfAvg();
			
		}
		System.out.println(Line.sLine(50));
		// %s = 글자 그대로 표시
		// %6s = 전체 6자리 문자칸을 만들고 남은 공백은 비워둬라 -> 총      점
		System.out.printf("%-3s\t", "총점");
		System.out.printf("%4.fd\t",totals[Score.I_KOR]);
		System.out.printf("%4.fd\t",totals[Score.I_ENG]);
		System.out.printf("%4.fd\t",totals[Score.I_MATH]);
		System.out.printf("%6.fd\t",totals[Score.I_TOTAL]);
		System.out.printf("%4.2f\n",totals[Score.I_AVG] / scores.length);
		System.out.println(Line.dLine(50));

	}

	}


