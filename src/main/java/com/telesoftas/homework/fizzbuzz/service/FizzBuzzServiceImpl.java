package com.telesoftas.homework.fizzbuzz.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.telesoftas.homework.fizzbuzz.entity.Result;

@Component(value="fizzBuzzService")
public class FizzBuzzServiceImpl implements FizzBuzzService {
    
    private static final String FIZZ_TEXT = "Fizz";
    private static final String BUZZ_TEXT = "Buzz";
    private static final String FIZZ_BUZZ_TEXT = "FizzBuzz";

    public List<Result> countFizzBuzz(int count) {
        System.out.println("Counting fizz buzz started. Participants count = " + count);
        List<Result> results = new ArrayList<Result>();
        for (int i = 1; i <= count; i++) {
            String val = "";
            if ((i % 3) == 0 && (i % 5) == 0) {
                val = FIZZ_BUZZ_TEXT;
            } else if ((i % 3) == 0) {
                val = FIZZ_TEXT;
            } else if ((i % 5) == 0) {
                val = BUZZ_TEXT;
            } else {
                val = ""+i;
            }
            Result r = new Result(i, val, new Date());
            results.add(r);
        }
        System.out.println("Counting fizz buzz completed");
        return results;
    }

}
