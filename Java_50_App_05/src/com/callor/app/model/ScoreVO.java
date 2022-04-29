package com.callor.app.model;

import com.callor.app.line.Line;

public class ScoreVO {
	
	private int int_num;
	private int int_Kor;
	private int int_Eng;
	private int int_Math;
	public int getInt_num() {
		return int_num;
	}
	public void setInt_num(int int_num) {
		this.int_num = int_num;
	}
	public int getInt_Kor() {
		return int_Kor;
	}
	public void setInt_Kor(int int_Kor) {
		this.int_Kor = int_Kor;
	}
	public int getInt_Eng() {
		return int_Eng;
	}
	public void setInt_Eng(int int_Eng) {
		this.int_Eng = int_Eng;
	}
	public int getInt_Math() {
		return int_Math;
	}
	public void setInt_Math(int int_Math) {
		this.int_Math = int_Math;
	}
	@Override
	public String toString() {
		return "ScoreVO [int_num=" + int_num + ", int_Kor=" + int_Kor + ", int_Eng=" + int_Eng + ", int_Math="
				+ int_Math + "]";
	}
	
	
	
	
		
	

}
