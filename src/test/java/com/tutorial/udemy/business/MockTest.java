package com.tutorial.udemy.business;

import com.tutorial.udemy.data.TodoService;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.*;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class MockTest {

    @Parameters
    public static List<List[]> testCases(){
        List[][] a = {
                { Arrays.asList("Adam", "BCDSpring"), Arrays.asList("BCDSpring") },
                { Arrays.asList(), Arrays.asList() },
                { Arrays.asList("Adam"), Arrays.asList() },
                { Arrays.asList("Spring", "SpringOne"), Arrays.asList("Spring", "SpringOne") }
        };
        return Arrays.asList(a);
    }
    private List<String> input;
    private List<String> output;

    public MockTest(List<String> input, List<String> expectedOutput){
        this.input = input;
        this.output = expectedOutput;
    }

    @Test
    public void testTodoBusinessImplUsingMock(){
        TodoService serviceStub = mock(TodoService.class);
        when(serviceStub.retrieveTodos("Adam")).thenReturn(input);

        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(serviceStub);

        assertEquals(output,        todoBusiness.retrieveTodosRelatedToSpring("Adam"));
    }
}
