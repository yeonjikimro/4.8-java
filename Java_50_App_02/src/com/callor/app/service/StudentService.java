package com.callor.app.service;

import java.util.List;

import com.callor.app.domain.StudentVO;

public interface StudentService {

	public void loadStudent();
	public List<StudentVO> getStudents();
	// stNum 값이 중복되지 않을 때 : StudentVO
	public StudentVO findByStNum(String stNum);
	// stName 값이 중복될 수도 있을 때 : List<StudentVO>
	public List<StudentVO> findByStName(String stName);
	
	
	

}
