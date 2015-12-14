package todo.webservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import todo.model.Todolist;

@Service
public class ToDoWebServiceImpl implements ToDoWebService {

	List<Todolist> todo = new ArrayList<Todolist>();
	private static Long id = 0L;


	@Override
	public List<Todolist> viewAllTodolist(){
		return todo;
	}

	@Override
	public void createTodolist(Todolist todothing){

		todothing.setId(id);
		todo.add(todothing);
		++id;
	}

	@Override
	public void updateTodolist(int pos, Todolist updateTodolist){
		todo.set(pos, updateTodolist);
	}

	@Override
	public void deleteTodolist(int id){
		todo.remove(id);
	}



}
