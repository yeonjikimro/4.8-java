package com.callor.arrays.service;

/*
 * makeScore()
 * printScore()
 * sumScore()
 * ���� method �� �����ϰ�
 * 
 * ���� ������ �����Ͽ� intKor �� ����
 * �����϶�ǥ ���
 * �������
 * 
 */
public class ScoreServiceV5 {

	private int[] intKor;
	
	public ScoreServiceV5(int count) {
		intKor = new int[count];
		
	}

	int intFirst = 0;
	public void makeScore() {
		for(int i = 0; i < intKor.length; i ++) {
			intKor[i] = (int)(Math.random() * 50) + 51;
			intFirst += intKor[i];
			System.out.println("1�г� ���� : " + intKor[i]);
		}
	}
	int intSec = 0;
	public void printScore() {
		for(int i = 0; i < intKor.length; i ++) {
			
			intKor[i] = (int)(Math.random() * 50) + 51;
			intSec += intKor[i];
			System.out.println("2�г� ���� : " + intKor[i]);
		}
	}
	int intSum = 0;
	int i = 0;
	public void sumScore() {
			
			intSum = intFirst;
			intSum += intSec;
			System.out.println("���� ���� : " + intSum);
		}
	}
	

