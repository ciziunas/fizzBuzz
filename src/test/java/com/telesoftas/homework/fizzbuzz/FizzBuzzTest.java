package com.telesoftas.homework.fizzbuzz;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz testee;

    @Before
    public void setup() {
        testee = new FizzBuzz();
    }

    @Test
    public void validResultsTest() {
        System.out.println("validResultsTest started");
        //given -> default app with 100 fizz buzz records
        // when fizz buzz executed
        testee.execute();
        
        //then -> fizz, buzz or number is printed
        Assert.assertEquals("1", testee.getResults().get(0).getResult());
        Assert.assertEquals("2", testee.getResults().get(1).getResult());
        Assert.assertEquals("Fizz", testee.getResults().get(2).getResult());
        Assert.assertEquals("Buzz", testee.getResults().get(49).getResult());
        Assert.assertEquals("Fizz", testee.getResults().get(98).getResult());
        Assert.assertEquals("Buzz", testee.getResults().get(99).getResult());
        Assert.assertEquals(100, testee.getResults().size());
        System.out.println("validResultsTest finished");
    }
    
    @Test
    public void noResultsTest() {
        System.out.println("noResultsTest started");
        //given -> default app with 100 fizz buzz records
        // when fizz buzz is not executed
        //then -> results count is zero
        Assert.assertEquals(0, testee.getResults().size());
        System.out.println("noResultsTest finished");
    }
    
}