package com.callor.app.exec;

import java.io.InputStream;
import java.util.Scanner;

public class Exec08 {
	/*
	 * data.txt 파일의 내용을
	 * console 에 한 라인씩 출력하시오
	 */
	public static void main(String[] args) {
		String fileName = "data.txt";
		InputStream data = Exec07.class.getResourceAsStream(fileName);
		
		Scanner scan = new Scanner(data);
		
		
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
	}
	

}
