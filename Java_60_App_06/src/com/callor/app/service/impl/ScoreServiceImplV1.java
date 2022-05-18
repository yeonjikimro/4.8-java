package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {
	
	/*
	 * 생성자 패턴
	 * 클래스 영역(필드 영역) 에서 변수, 객체 배열 등을 선언만 하고
	 * private 으로 접근 제한을 하고
	 * 객체와 배열은 final 로 선언하고
	 * (java 에서는 기본, spring 임의) 생성자 method 에서
	 * 선언된 변수를 초기화(생성, 사용할 준비)를 한다.
	 * 
	 * 만약 이 클래스를 상속할 수 있도록 하려면
	 * 변수를 protected로 변경
	 */
	protected final List<ScoreVO> scList ;
	public ScoreServiceImplV1() {	
		scList = new ArrayList<>();
	}

	@Override
	public void makeScore() {
		
		for(int i = 0; i < 10; i++) {
			
			int intKor = (int)(Math.random() * 50) + 51;
			int intEng = (int)(Math.random() * 50) + 51;
			int intMath = (int)(Math.random() * 50) + 51;
			
			ScoreVO scVO = new ScoreVO();
			scVO.setIntKor(intKor);
			scVO.setIntEng(intEng);
			scVO.setIntMath(intMath);
			
			scList.add(scVO);
			System.out.println(scVO);
		}
		//
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sumScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void avgScore() {
		// TODO Auto-generated method stub
		
	}
	

}
