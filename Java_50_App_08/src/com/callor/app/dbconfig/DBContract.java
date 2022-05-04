package com.callor.app.dbconfig;

public class DBContract {

	public static final String ST_SELECT = 
			" SELECT * FROM tbl_student ORDER BY st_num ";
	public static class ST_COL {
		
		
		// 문자열을 변수에 담기 - 오류 발견 가능
		public static final String ST_NUM = "ST_NUM";
		public static final String ST_NAME = "ST_NAME";
		public static final String ST_DEPT = "ST_DEPT";
		public static final String ST_GRADE = "ST_GRADE";
		public static final String ST_TEL = "ST_TEL";
		public static final String ST_ADDR = "ST_ADDR";
		
		
		
		
	
	}



	
	
}
