package com.callor.todo.controller;

import java.util.List;

import com.callor.todo.model.TodoVO;
import com.callor.todo.service.TodoService;
import com.callor.todo.service.impl.TodoServiceImplV1;

public class TodoController {
	
	public static void main(String[] args) {
		// 인터페이스를 상속받은 클래스는 생성자를 만들 때
		// 인터페이스를 선언하고 먼저 클래스를 선언한다.
		TodoService tService = new TodoServiceImplV1();
		tService.todoInsert("오늘은 행복한 화요일");
		
		List<TodoVO> todoList = tService.todoSelectAll();
		
		for(TodoVO tVO : todoList) {
			System.out.println(tVO.toString());
		}
		
	}
	
}
