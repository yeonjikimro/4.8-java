package com.callor.arrays.service;

public class ScoreServiceV3 {
	
	/*
	 * Ŭ���� ������ ����� �迭(����) = �ν��Ͻ� �迭(����)
	 * ������ Ŭ���� ������ ������ ���� Ư���� ��찡 �ƴϸ�
	 * private ���� �����ڸ� �����Ѵ�.
	 * 
	 * ������ ���� :
	 * Ŭ���� ������ ����� ������ private �� ���������ν�
	 * ������ �ܺ��� ������ �����Ѵ�.
	 */
	private int[] intKor;
	
	public ScoreServiceV3() {
		intKor = new int[100];
		
	}
	
	public void printNo1Score() {
		System.out.println("1�� �л� ���� : " + intKor[1]);
	}

}
