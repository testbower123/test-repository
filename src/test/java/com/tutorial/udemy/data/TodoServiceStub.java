package com.tutorial.udemy.data;

import com.tutorial.udemy.data.TodoService;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {
    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("asd","bcd", "xyzSpring" );
    }
}
