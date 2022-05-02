package com.callor.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor 
// 모든 변수를 다 매개변수로 갖는 임의생성자
@NoArgsConstructor 
// 기본 생성자
@Builder
public class StudentVO {

	
	private String stNum;
	private String stName;
	private String stTel;
	private String stAddr;
	private String stDept;
	private int stGrade;
	
	
	
}
