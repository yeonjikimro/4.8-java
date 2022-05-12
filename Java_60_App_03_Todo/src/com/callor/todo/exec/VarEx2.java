package com.callor.todo.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.todo.model.TodoVO;
import com.callor.utils.Line;

public class VarEx2 {
	
	public static void main(String[] args) {
		
		List<TodoVO> todoList = new ArrayList<>();
		
		/*
		 * Builder 패턴을 사용한 VO 객체 생성
		 * 클래스.builder() 메서드에 의해서 VO 객체가 선언되고
		 * 필드변수로 선언한 것과 같은 이름의 setter method 를 사용하여
		 * VO 객체의 각 변수 값을 채워 넣으면서 VO 객체를 생성하는 것 
		 */
		TodoVO tVO = TodoVO.builder().sdate("2022-05-11").tContent("과제하기").build();
		
		todoList.add(tVO);
		
		// 기본 생성자를 사용하여 객체 초기화 하고
		// setter method 를 사용하여 각 변수 값을 저장하기
		tVO = new TodoVO();
		tVO.setSdate("2022-05-22");
		tVO.setTContent("목요일 오후");
		todoList.add(tVO);
		
		// 필드생성자를 사용하여 객체 변수를 저장하면서
		// 객체를 생성하기 
		tVO = new TodoVO("001", "생성자", "2022-05-22","09:00:00", "", "", false);
		
		todoList.add(tVO);
		
		for(TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}
		
		// todoList 의 0번째 요소를 getter 하면
		// 한 개의 todoVO를 추출할 수 있다
		TodoVO todoVO = todoList.get(0);
		todoVO.setTKey("009");
		// 이 두 줄을 한 줄로 만들 수 있다.
		// todoList.get(1).setTKey("101");
		todoList.set(0, todoVO); // 참조형 변수이기 때문에 이 코드는 필요 없다.
		
		System.out.println(Line.dLine(100));
		for(TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}
		
		// todoList.get(i)를 하면 이 것이 하나의 VO가 된다.=vo.setTKey();
		todoList.get(1).setTKey("101");
	}

}
