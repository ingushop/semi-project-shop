package com.shop.repository;


import com.shop.repository.dto.CategoryDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class CategoryRepositoryTest {

    @Autowired
    CategoryRepository categoryRepository;


    @Test
    @Order(1)
    @DisplayName("insert")
    void insertTest() {

        CategoryDTO category1 = new CategoryDTO().builder()
                .contents("TOP")
                .depth(0)
                .build();

        CategoryDTO category2 = new CategoryDTO().builder()
                .contents("BAG")
                .depth(1)
                .build();

        CategoryDTO category3 = new CategoryDTO().builder()
                .contents("RING")
                .depth(1)
                .build();

        boolean result1 = (categoryRepository.insert(category1) == 1);
        boolean result2 = (categoryRepository.insert(category2) == 1);
        boolean result3 = (categoryRepository.insert(category3) == 1);

        System.out.println(result1 && result2 && result3);
    }//  insertTest


    @Test
    @Order(2)
    @DisplayName("findAll")
    void findAllTest() {

        List<CategoryDTO> results = categoryRepository.findAll();

        results.forEach(System.out::println);
    }// findAllTest

    @Test
    @Order(3)
    @DisplayName("findByContents")
    void findByContentsTest() {

        List<CategoryDTO> results = categoryRepository.findByContents("TOP");

        results.forEach(System.out::println);
    }// findAllTest


    @Test
    @Order(4)
    @DisplayName("modify")
    void modifyTest() {

        CategoryDTO category = new CategoryDTO().builder()
                .id(1L)
                .contents("ACCESSORY")
                .build();
        System.out.println(category.toString());

        int result = categoryRepository.modify(category);
        System.out.println(result == 1);
    }// findAllTest



}// end class