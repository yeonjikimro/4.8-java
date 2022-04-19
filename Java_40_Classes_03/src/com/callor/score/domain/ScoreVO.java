package com.callor.score.domain;

/*
 * VO 클래스
 * Value Object 클래스
 * 객체지향 프로그래밍에서 가장 중요한 역할을 수행할 클래스
 * 변수들의 묶음이고, "데이터를 한 개이 그룹"으로 묶어서 정보처리에 사용할
 * 용도로 선언하는 클래스이다
 */
public class ScoreVO {
	
	/* 인스턴스변수
	 * 클래스 영역에 선언된 변수
	 * ScoreVO 클래스를 사용하여 객체를 선언하고
	 * 생성자를 호출하여 인스턴스화 할 때 같이 선언 및 초기화 되는 변수
	 */
//	public String stName = "";
//	public int intKor = 0; 이렇게 초기화하지 않아도 인스턴스변수는 자동으로 선언됨(굳이 하고 싶다면 생성자메소드이용)
	public String stName;
	public int intKor;
	public int intEng;
	public int intMath;
	public int intSum;

}
