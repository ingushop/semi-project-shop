package com.shop.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class ProductRepositoryTest {


    @Autowired CategoryRepository categoryRepository;
    @Autowired ModelRepository modelRepository;
    @Autowired ProductRepository productRepository;
    @Autowired SizeOptionRepository sizeOptionRepository;

    @Test
    @Order(1)
    @DisplayName("C")
    void create(){
        categoryRepository.
    }

    @Test
    @Order(2)
    @DisplayName("R")
    void findAll(){
        printList(modelRepository.findAll());
    }

    void printList(List<Object> list){
        list.forEach(System.out::println);
    }

    @Test
    @Order(3)
    @DisplayName("U")
    void modify(){


    }

    @Test
    @Order(4)
    @DisplayName("D")
    void delete(){
        System.out.println(userRepository.delete(7L));
    }

}
