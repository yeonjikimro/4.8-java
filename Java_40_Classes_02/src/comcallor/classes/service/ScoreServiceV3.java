package comcallor.classes.service;

public class ScoreServiceV3 {

	protected String[] students;
	protected int[] intKor;
	
	public ScoreServiceV3() {
		this(10);
	}
	// 임의생성자- 정수값을 받아 정수의 개수만큼 배열을 만듬
	public ScoreServiceV3(int length) {
		students = new String[length];
		intKor = new int[length];
	}
	// 학생 이름 리스트를 args 로 받음
	public ScoreServiceV3(String[] students) {
		this.students = students;
		this.intKor = new int[this.students.length];
	}
	
}
