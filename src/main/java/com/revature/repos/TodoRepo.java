package com.revature.repos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.revature.models.Todo;

@Repository
public class TodoRepo {
	
	private List<Todo> todos;
	
	public TodoRepo() {
		todos = new ArrayList<>();
		todos.add(new Todo(1,"Make a cup of Java",false));
		todos.add(new Todo(2,"Feed my Python",false));
	}
	
	public List<Todo> getTodoList(){
		return todos;
	}
	
	public Todo getTodoById(int id) {
		return todos.get(id-1);
	}
	
	public boolean addTodo(Todo todo) {
		todos.add(todo);
		return true;
	}

}
