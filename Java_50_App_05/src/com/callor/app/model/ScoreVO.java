package com.callor.app.model;

import com.callor.app.line.Line;

public class ScoreVO {
	
	private int int_num;
	private int int_kor;
	private int int_eng;
	private int int_math;
	private int int_total;
	private int int_avg;
	
	
	public int getInt_num() {
		return int_num;
	}
	public void setInt_num(int int_num) {
		this.int_num = int_num;
	}
	public int getInt_kor() {
		return int_kor;
	}
	public void setInt_kor(int int_kor) {
		this.int_kor = int_kor;
	}
	public int getInt_eng() {
		return int_eng;
	}
	public void setInt_eng(int int_eng) {
		this.int_eng = int_eng;
	}
	public int getInt_math() {
		return int_math;
	}
	public void setInt_math(int int_math) {
		this.int_math = int_math;
	}
	
	
	public int getInt_total() {
		int_total = (int_kor + int_eng + int_math);
		return int_total;
	}
	public void setInt_total(int int_total) {
		this.int_total = int_total;
	}
	public int getInt_avg() {
		int_avg = (int_kor + int_eng + int_math)/3;
		return int_avg;
	}
	public void setInt_avg(int int_avg) {
		this.int_avg = int_avg;
	}
	
	
	
	@Override
	public String toString() {
		return "ScoreVO [int_num=" + int_num + ", int_kor=" + int_kor + ", int_eng=" + int_eng + ", int_math="
				+ int_math + ", int_total=" + int_total + ", int_avg=" + int_avg + "]";
	}
<<<<<<< HEAD
=======

>>>>>>> 82d0909d6f75b1fc77c725e69dc4e148e7794e91


}