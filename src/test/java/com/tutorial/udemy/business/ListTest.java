package com.tutorial.udemy.business;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test(expected = RuntimeException.class)
    public void testSize(){
        List mockList = mock(List.class);
        when(mockList.size()).thenReturn(100).thenReturn(2);
        when(mockList.get(anyInt())).thenThrow(new RuntimeException());

        assertEquals("Adam", mockList.get(0));
        assertEquals(100, mockList.size());
        assertEquals(2, mockList.size());
        assertEquals(20 , mockList.size());
    }
}
