package com.telesoftas.homework.fizzbuzz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FizzBuzzContext {
    
    private static FizzBuzzContext instance;
    private ApplicationContext applicationContext;
    
    private FizzBuzzContext() {
        applicationContext = new ClassPathXmlApplicationContext("fizzBuzzContext.xml");
    }
    
    public static FizzBuzzContext getInstance() {
        if (instance == null) {
            instance = new FizzBuzzContext();
        }
        return instance;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

}
