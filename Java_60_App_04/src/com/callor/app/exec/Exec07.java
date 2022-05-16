package com.callor.app.exec;

import java.io.InputStream;
import java.util.Scanner;

import com.callor.utils.Line;

public class Exec07 {
	
	public static void main(String[] args) {
		
		System.out.println(Line.dLine(20));
		System.out.println("7단 구구단");
		System.out.println(Line.sLine(20));
		
		for(int i = 2 ; i < 10; i ++) {
			int seven = 7 * i;
			
			System.out.printf("7 x %d = %d\n", i, seven);
			
		}
		System.out.println(Line.dLine(20));
		
		

	}

}
