package com.tutorial.udemy.business;

import com.tutorial.udemy.data.TodoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TodoBusinessImpl {

    private TodoService todoService;
    public TodoBusinessImpl(TodoService todoService){
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user){
        List<String> todos = todoService.retrieveTodos(user);
        List<String> filteredTodos = todos.stream().filter(x -> x.contains("Spring")).collect(Collectors.toList());
        return filteredTodos;
    }

}
