package com.callor.app.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString

public class BookVO {
	public BookVO() {
		// TODO Auto-generated constructor stub
	}
	
	private String title;
	private String comp;
	private String author;
	private String pubDate;
	private int price;
	
	public void add(BookVO[] bookVO) {
		
	}
	

	
}
