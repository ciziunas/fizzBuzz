package com.telesoftas.homework.fizzbuzz.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.telesoftas.homework.fizzbuzz.entity.Result;

@Repository
public interface ResultRepository extends ElasticsearchRepository<Result, Integer> {
}