package com.callor.app.service;

public class ServiceV4 {

	private final int[] intArray;
	public ServiceV4(int[] intArray) {
		// final int[] intArray 라는 것 - this
		this.intArray = intArray;
	}
	
	public void makeScore() {
		for(int i = 0; i < intArray.length; i++) {
			int rnd = (int)(Math.random() * 100) + 1;
			intArray[i] = rnd;
		}
	}
	
	
	
}
