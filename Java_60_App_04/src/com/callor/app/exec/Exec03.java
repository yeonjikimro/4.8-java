package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.BookVO;

public class Exec03{

	public static void main(String[] args) {
		
		
		List<BookVO> bookList = null;
		/*
		 * 1개의 bookVO를 만들면 
		 * 같은 bookVO를 list에 10번 추가하기
		 * 모든 list 의 주소가 동일한 상태로
		 * 가장 마지막에 저장한 값으로 모두 통일돼버린다.
		 * 그렇기 때문에 bookVO를 for 문 안에 넣어야 한다.
		 */
		// BookVO bookVO = new BookVO();
		
		bookList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			// bookVO1 을 10번 다시 생성하면서
			// title 에 Setting 하고
			// List 에 추가
			BookVO bookVO = new BookVO();
			bookVO.setTitle("Do it 자바");
			bookVO.setComp("이지즈퍼블리시");
			bookList.add(bookVO);
			
		}
		System.out.println(bookList);
	}
}
