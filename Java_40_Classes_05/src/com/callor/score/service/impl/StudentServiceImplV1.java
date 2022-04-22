package com.callor.score.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import javax.imageio.stream.FileCacheImageInputStream;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	// 학생데이터들을 저장할 배열변수
	private StudentVO[] stList;
	// 학생데이터가 저장된 text file 이름
	private String stFile;
	
//	public StudentServiceImplV1() {
//		// TODO Auto-generated constructor stub
//	}
	public StudentServiceImplV1(String stFile, int length) {
		// arg stFile의 값을 String stFile에 저장
		this.stFile = stFile;
		this.stList = new StudentVO[length];
		for(int i = 0; i < this.stList.length; i++) {
			this.stList[i] = new StudentVO();
			// 각 요소 초기화 : 소괄호, 배열 : 대괄호
		}
	}
	
	
	@Override
	public void loadStudent() {
		// 파일 open: 파일 정보를 가져와서 변수에 저장하는 것
		// is 변수안에는 sFile에 대한 정보가 저장되어있음(FileInputStream)
		InputStream is = null;
		try {
			is = new FileInputStream(this.stFile);
		} catch (FileNotFoundException e) {

//			e.printStackTrace();
			System.out.println(stFile + " 파일을 찾을 수 없습니다. ");
			return; // 메소드 실행을 무조건 종료해라
		}
		Scanner scan = new Scanner(is);
		/*
		while(true) {
			boolean bYes = scan.hasNext();
			if(bYes == false) {
				break;
			}
			String stLine = scan.nextLine();
			System.out.println(stLine);
		}
		*/
		int index = 0; // stList 의 요소를 가르키는 값
		// 다 내용을 읽었는지 확인하는 코드
		while(scan.hasNext()) {
			String stLine = scan.nextLine();
			System.out.println();
			String[] stInfos = stLine.split(":");
			
			System.out.println("학번:" + stInfos[0]);
			System.out.println("이름:" + stInfos[1]);
			System.out.println("학년:" + stInfos[2]);
			System.out.println("학과:" + stInfos[4]);
			System.out.println("주소:" + stInfos[5]);
			
			StudentVO stVO = new StudentVO();
			stVO.setStName(stInfos[0]);
			stVO.setStName(stInfos[1]);
			stVO.setStGrade(stInfos[2]);
			stVO.setStDept(stInfos[4]);
			stVO.setStAddr(stInfos[5]);
			
			stList[index++] = stVO;
		} // end while 여기를 지나면 stList에 모든 데이터가 담겨 있을 것이다.
		this.printStudents();
		
	} // end loadStudent
	
	// V1 에서 stList에 담긴 데이터들을 확인하기 위하여
	// 내부용으로 만든 method
	private void printStudents() {
		
		for(int i = 0; i < stList.length; i++ ) {
			System.out.println(stList[i].toString());
		}
		for(StudentVO vo : stList) {
			
			System.out.println(vo.toString());
		}
	}

	@Override
	public StudentVO[] getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentVO findByNum(String stNum) {
		return null;
		// TODO Auto-generated method stub

	}

}
