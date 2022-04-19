package com.callor.score.domain;

public class ScoreV2VO /*extends Object*/{
// 필드=속성=클래스안의 변수
	private String stName;
	private  int intKor;
	private  int intEng;
	private  int intMath;
	private  int intSum;
	private float fAvg;

	
	public int getIntSum() {
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		return intSum;
	}
	public float getfAvg() {
		
		fAvg = (float)getIntSum() / 3.0f;
		
		return fAvg;
	}

	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	@Override
	public String toString() {
		return "ScoreV2VO [stName=" + stName 
				+ ", intKor=" + intKor 
				+ ", intEng=" + intEng 
				+ ", intMath=" + intMath
				+ ", intSum=" + getIntSum()
				+ ", fAvg=" + getfAvg() + "]";
	}
	


}
