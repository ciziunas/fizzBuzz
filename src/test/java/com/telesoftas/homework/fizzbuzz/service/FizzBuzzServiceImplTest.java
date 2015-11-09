package com.telesoftas.homework.fizzbuzz.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.telesoftas.homework.fizzbuzz.entity.Result;
import com.telesoftas.homework.fizzbuzz.util.FizzBuzzDataUtil;

public class FizzBuzzServiceImplTest {

    private static final String RESULTS_FILENAME = "fizzBuzzResults.txt";
    private FizzBuzzService testee;

    @Before
    public void setup() {
        testee = new FizzBuzzServiceImpl();
    }

    @Test
    public void success50participantsTest() {
        // GIVEN 50 fizzBuzz participants
        // GIVEN file with expected result list
        int participants = 50;
        List<Result> expected = FizzBuzzDataUtil.buildPreparedResultList(participants, RESULTS_FILENAME);

        // WHEN fizzBuzzService executed
        List<Result> results = testee.countFizzBuzz(participants);

        // THEN expected result list is equal to results returned from service
        // THEN result list size is equal to 50
        Assert.assertEquals(expected, results);
        Assert.assertEquals(participants, results.size());
    }

    @Test
    public void success0participantsTest() {
        // GIVEN 0 fizzBuzz participants
        // GIVEN file with expected result list
        int participants = 0;
        List<Result> expected = FizzBuzzDataUtil.buildPreparedResultList(participants, RESULTS_FILENAME);

        // WHEN fizzBuzzService executed
        List<Result> results = testee.countFizzBuzz(participants);
        System.out.println(results.size());

        // THEN expected result list is equal to results returned from service
        // THEN result list size is equal to 0
        Assert.assertEquals(expected, results);
        Assert.assertEquals(participants, results.size());
    }

    @Test
    public void negativeParticipantsCountTest() {
        // GIVEN -10 fizzBuzz participants count
        // GIVEN file with expected result list
        int participants = -10;
        List<Result> expected = FizzBuzzDataUtil.buildPreparedResultList(participants, RESULTS_FILENAME);

        // WHEN fizzBuzzService executed
        List<Result> results = testee.countFizzBuzz(participants);

        // THEN expected result list is equal to results returned from service
        // THEN result list size is equal to 0
        Assert.assertEquals(expected, results);
        Assert.assertEquals(0, results.size());
    }

}