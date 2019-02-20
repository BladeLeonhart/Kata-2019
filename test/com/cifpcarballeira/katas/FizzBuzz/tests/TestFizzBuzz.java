package com.cifpcarballeira.katas.FizzBuzz.tests;

import com.cifpcarballeira.katas.FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFizzBuzz {

    public TestFizzBuzz() {
    }

    @Test
    public void testdevuelve1() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(1);
        assertEquals("1", result);
    }
}
