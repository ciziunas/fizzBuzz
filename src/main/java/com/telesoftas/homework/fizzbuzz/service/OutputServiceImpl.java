package com.telesoftas.homework.fizzbuzz.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.telesoftas.homework.fizzbuzz.entity.Result;

@Component(value = "outputService")
public class OutputServiceImpl implements OutputService {

    public void print(List<Result> results) {
        System.out.println("Printing using lambda expression started");
        results.forEach(n -> System.out.println(n));
        System.out.println("Printing finished");
    }

}
 