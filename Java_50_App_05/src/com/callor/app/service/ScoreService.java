package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

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

	
	private List<ScoreVO> scList;
	public ScoreService() {
		scList = new ArrayList<>();
	}
	public void makeScore() {

		for(int i = 0; i < 20; i++) {
			ScoreVO scVO = new ScoreVO();
			scVO.setInt_num(i + 1);
			int kor	= (int)(Math.random() * 50) + 51;
			int eng	= (int)(Math.random() * 50) + 51;
			int math= (int)(Math.random() * 50) + 51;
			scVO.setInt_Kor(kor);
			scVO.setInt_Eng(eng);
			scVO.setInt_Math(math);
			scList.add(scVO);
			

		}
	}

		public void printScore() {
			for(ScoreVO scVO : scList) {
				System.out.printf("%d\t%d\t%d\t%d\n",
							scVO.getInt_num(),
							scVO.getInt_Kor(),
							scVO.getInt_Eng(),
							scVO.getInt_Math()
							);
			}
		
		
	}

}
