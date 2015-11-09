package com.telesoftas.homework.fizzbuzz.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.telesoftas.homework.fizzbuzz.entity.Result;

public class FizzBuzzDataUtil {
    
    public static List<Result> buildPreparedResultList(int count, String fileName) {
        List<Result> results = new ArrayList<>();
        String file = getResultPath(fileName);
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
            String result;
            int i = 1;
            while ((result = br.readLine()) != null && i <= count) {
                Result r = new Result(i, result, new Date());
                results.add(r);
                i++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return results;
    }
    
    private static String getResultPath(String fileName) {
        URL url = FizzBuzzDataUtil.class.getClassLoader().getResource(fileName);
        if (url == null) {
            throw new IllegalArgumentException(fileName + " is not found");
        }
        return url.getFile();
    }

}
