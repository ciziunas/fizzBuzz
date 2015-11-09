package com.telesoftas.homework.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

import com.telesoftas.homework.fizzbuzz.entity.Result;
import com.telesoftas.homework.fizzbuzz.service.DataService;
import com.telesoftas.homework.fizzbuzz.service.FizzBuzzService;
import com.telesoftas.homework.fizzbuzz.service.OutputService;

public class FizzBuzz {
    
    private static final int FIZZ_BUZZ_PARTICIPANTS_COUNT = 100;
    
    private FizzBuzzService fizzBuzzService;
    private DataService dataService;
    private OutputService outputService;
    private List<Result> results = new ArrayList<Result>();
    
    public FizzBuzz() {
        FizzBuzzContext ctx = FizzBuzzContext.getInstance();
        fizzBuzzService = (FizzBuzzService) ctx.getApplicationContext().getBean("fizzBuzzService");
        dataService = (DataService) ctx.getApplicationContext().getBean("dataService");
        outputService = (OutputService) ctx.getApplicationContext().getBean("outputService");
    }
    
    public void execute() {
        results = fizzBuzzService.countFizzBuzz(FIZZ_BUZZ_PARTICIPANTS_COUNT);
        dataService.save(results);
        outputService.print(results);
    }
    
    public static void main(String... args) {
        System.out.println("FizzBuzz application started");
        System.out.println("Initializing components...");
        FizzBuzz app = new FizzBuzz();
        System.out.println("Initializing completed");
        app.execute();
        System.out.println("FizzBuzz application completed succesfully.");
    }

    public List<Result> getResults() {
        return results;
    }

    public DataService getDataService() {
        return dataService;
    }
    
}
