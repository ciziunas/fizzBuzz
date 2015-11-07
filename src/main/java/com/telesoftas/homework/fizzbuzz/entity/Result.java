package com.telesoftas.homework.fizzbuzz.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "result")
public class Result {
    @Id
    private Integer number;
    private String result;
    private Date createdDate;
    
    public Result() {}
    
    public Result(int number, String result, Date createdDate) {
        this.number = number;
        this.result = result;
        this.createdDate = createdDate;
    }
    
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return result;
    }
    
}