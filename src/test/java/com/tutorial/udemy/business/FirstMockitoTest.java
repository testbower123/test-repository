package com.tutorial.udemy.business;

import com.tutorial.udemy.data.TodoServiceStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstMockitoTest {
    TodoServiceStub serviceStub = new TodoServiceStub();

    @Test
    public void testTodoBusinessImpl(){
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(serviceStub);
        assertEquals(1,        todoBusiness.retrieveTodosRelatedToSpring("Adam").size());
    }
}
