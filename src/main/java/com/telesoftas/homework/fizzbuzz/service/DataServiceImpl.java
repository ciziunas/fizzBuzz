package com.telesoftas.homework.fizzbuzz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.telesoftas.homework.fizzbuzz.entity.Result;
import com.telesoftas.homework.fizzbuzz.repository.ResultRepository;

@Component(value="dataService")
public class DataServiceImpl implements DataService {
    
    @Autowired
    private ResultRepository resultRepository;

    public void save(List<Result> results) {
        System.out.println("Saving results to DB");
        if (results != null) {
            for (Result r : results) {
                System.out.print(".");
                resultRepository.save(r);
            }
            System.out.println("");
        }
        System.out.println("Saving results to DB completed");
    }

}
