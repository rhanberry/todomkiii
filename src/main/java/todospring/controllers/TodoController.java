package main.java.todospring.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import todospring.model.Todolist;
import todospring.webservices.ToDoWebService;

@Controller
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	ToDoWebService toDoWebService;
	
	@RequestMapping(value = "/all.json", method = RequestMethod.GET)
	public @ResponseBody ArrayList<Todolist> viewAllTodolist(){
		return (ArrayList<Todolist>) toDoWebService.viewAllTodolist();
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody void addTodolist(@RequestBody Todolist todothing){
		toDoWebService.createTodolist(todothing);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void deleteTodolist(@PathVariable("id") String id){
		toDoWebService.deleteTodolist(Integer.valueOf(id));
	}

	@RequestMapping(value = "/update/{pos}", method = RequestMethod.PUT)
	public @ResponseBody void updateTodolist(@RequestBody Todolist todothing, @PathVariable("pos") String pos){
		toDoWebService.updateTodolist(Integer.valueOf(pos), todothing);
	}


}
