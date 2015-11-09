package com.telesoftas.homework.fizzbuzz;

import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.telesoftas.homework.fizzbuzz.entity.Result;
import com.telesoftas.homework.fizzbuzz.util.FizzBuzzDataUtil;

/**
 * Fizz Buzz application integration test
 * 
 * @author marius ciziunas
 *
 */
public class FizzBuzzIT {
    
    private static final String RESULTS_FILENAME = "fizzBuzzResults.txt";

    private FizzBuzz testee;

    @Before
    public void setup() {
        testee = new FizzBuzz();
    }
    
    @Test
    public void validResultsTest() {
        // GIVEN 100 fizzBuzz participants
        // GIVEN file with expected result list
        int participants = 100;
        List<Result> expected = FizzBuzzDataUtil.buildPreparedResultList(participants, RESULTS_FILENAME);
        
        // WHEN fizzBuzz is executed
        // WHEN results are fetched from DB
        // WHEN results are sorted by queue number
        testee.execute();
        List<Result> results = testee.getDataService().findAll();
        Collections.sort(results);
        
        // THEN expected result list is equal to results returned from service
        // THEN result list size is equal to 100
        Assert.assertEquals(expected, results);
        Assert.assertEquals(participants, results.size());
    }
    
}