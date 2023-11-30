package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Todo;
import com.revature.repos.TodoRepo;

@Service
public class TodoService {
	
	private TodoRepo todoRepo;
	
	@Autowired
	public TodoService(TodoRepo todoRepo) {
		this.todoRepo=todoRepo;
	}
	
	public List<Todo> getList(){
		return todoRepo.getTodoList();
	}
	
	public Todo getSingleTodo(int id) {
		return todoRepo.getTodoById(id);
	}
	
	public boolean addTodo(Todo todo) {
		return todoRepo.addTodo(todo);
	}

}
