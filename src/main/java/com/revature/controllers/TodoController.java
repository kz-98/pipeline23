package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Todo;
import com.revature.services.TodoService;

//@Controller
@RequestMapping(path = "/todo")
//@ResponseBody
@RestController //Combines @Controller and @ResponseBody
public class TodoController {
	
	private TodoService todoService;
	
	@Autowired
	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}
	
	@GetMapping
	public List<Todo> getAllTodos(){
		return todoService.getList();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Todo> getTodoById(@PathVariable int id) {
		Todo todo = todoService.getSingleTodo(id);
		return ResponseEntity.status(200).body(todo);
	}
	
	@PostMapping
	public ResponseEntity<Todo> addTodo(@RequestBody Todo todo){
		if(todoService.addTodo(todo)) {
			return ResponseEntity.status(201).build();
		}else {
			return ResponseEntity.status(400).build();
		}
		
	}

}
