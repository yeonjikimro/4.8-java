package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.line.Line;
import com.callor.app.model.ScoreVO;

public class ScoreService {
	/*
	 * 1. 학생의 국어, 영어, 수학, 점수를 저장할 model.ScoreVO 클래스 작성
	 * 2. service.Scoreservice 클래스를 작성
	 * 3. List<ScoreVO>리스트를 선언하고
	 * 4. makeScore() method 에서 각 과목에 50~100 까지 임의의 정수를 생성하여 저장
	 * 5. 점수 List 를 20개 생성
	 * 6. scorePrint() method 에서 성적 리스트를 출력
	 */

	
	private List<ScoreVO> scoreList;
   
	public ScoreService(int size) {
		List<ScoreVO> sts = new ArrayList<>();
		this.scoreList = sts;
	} 
	


	public void makeScore() {

		for(int i = 0; i < 20; i++) {
			ScoreVO scVO = new ScoreVO();
			// int i = 0이기 때문에 i+1
			scVO.setInt_num(i + 1);
			// Math.random() * 100 + 1인지..
			int kor	= (int)(Math.random() * 50) + 51;
			int eng	= (int)(Math.random() * 50) + 51;
			int math= (int)(Math.random() * 50) + 51;
			scVO.setInt_kor(kor);
			scVO.setInt_eng(eng);
			scVO.setInt_math(math);
			scVO.setInt_total(kor+eng+math);
			scVO.setInt_avg(kor+eng+math/3);
			// List에다가 scCO 값들을 추가
			scoreList.add(scVO);
		}
		
	}

		public void printScore() {
			System.out.println(Line.dLine(50));
			System.out.println("학  번\t국어\t영어\t수학\t총점\t평균");
			for(ScoreVO scVO : scoreList) {
				System.out.printf("%d\t%d\t%d\t%d\n",
							scVO.getInt_num(),
							scVO.getInt_kor(),
							scVO.getInt_eng(),
							scVO.getInt_math(),
							scVO.getInt_total(),
							scVO.getInt_avg()
							);
			}
			System.out.println(Line.sLine(50));
			System.out.println(Line.dLine(50));

		}
		
		public void printSum() {
			int korSum = 0;
			int engSum = 0;
			int mathSum = 0;
			int totalSum = 0;
			int avgSum = 0;
			for(ScoreVO scVO : scoreList) {

				korSum += scVO.getInt_kor();

				engSum += scVO.getInt_eng();

				mathSum += scVO.getInt_math();
				totalSum += scVO.getInt_total();
				avgSum += scVO.getInt_avg();

			}

			System.out.printf("%s\t, %d\t, %d\t, %d\t, %d\t, %d\t", 
					"총  점", korSum, engSum, mathSum, totalSum, avgSum );
		}

}
