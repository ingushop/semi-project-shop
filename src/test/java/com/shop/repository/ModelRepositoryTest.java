package com.shop.repository;


import com.shop.repository.dto.CategoryDTO;
import com.shop.repository.dto.ModelDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
@Slf4j
public class ModelRepositoryTest {

    @Autowired
    ModelRepository modelRepository;


    @Test
    @Order(1)
    @DisplayName("insert")
    void insertTest() {

        ModelDTO model = new ModelDTO().builder()
                .code("AAAA0002")
                .categoryId(1L)
                .name("AA02")
                .contents("contents contents contents")
                .price(100000L)
                .status("IN_STOCK")
                .build();

        System.out.println(modelRepository.insert(model) == 1);
    }//  insertTest


    @Test
    @Order(2)
    @DisplayName("findAll")
    void findAllTest() {

        List<ModelDTO> results = modelRepository.findAll();

        results.forEach(System.out::println);
    }// findAllTest

    @Test
    @Order(3)
    @DisplayName("findByCategoryId")
    void findByCategoryId() {

        List<ModelDTO> results = modelRepository.findByCategoryId(1L);

        results.forEach(System.out::println);
    }// findAllTest

    @Test
    @Order(4)
    @DisplayName("findByName")
    void findByNameTest() {

        List<ModelDTO> results = modelRepository.findByName("AA01");

        results.forEach(System.out::println);
    }// findAllTest

    @Test
    @Order(5)
    @DisplayName("modify")
    void modifyTest() {

        ModelDTO model = new ModelDTO().builder()
                .id(1L)
                .categoryId(2L)
                .price(22222L)
                .modifiedDate(LocalDateTime.now())
                .build();

        modelRepository.modify(model);
    }// findAllTest



}// end class