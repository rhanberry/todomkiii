package todo.webservices;

import java.util.List;

import todo.model.Todolist;

/**
 * Created by rhanberry on 12/10/2015.
 */
public interface ToDoWebService {


    List<Todolist> viewAllTodolist();
    void createTodolist(Todolist todothing);
    void updateTodolist(int pos, Todolist updateTodolist);
    void deleteTodolist(int id);


}
