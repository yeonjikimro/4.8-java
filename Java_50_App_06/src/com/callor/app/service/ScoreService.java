package com.callor.app.service;
/*
 * 인터페이스를 선언하여(Controller를 제외한 다른 클래스에 interface를 만들어 두는게 좋음)
 * 학생의 점수를 생성할 makeScore() 메서드와
 * 성적리스트를 출력할 printScore() 메서드를 정의하기
 */
public interface ScoreService {
	
	public void makeScore();
	public void printScore();

}
