package com.example.demo;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class Euler2Test {
    //given
    Euler2 euler2 = new Euler2();
    int result;

    @Test
    public void shouldReturn10For13(){
        result=euler2.fibonacci(13);
        //then
        assertThat(result, CoreMatchers.is(10));
    }
    @Test
    public void shouldReturn44For89(){
        result=euler2.fibonacci(89);
        //then
        assertThat(result, CoreMatchers.is(44));
    }
}