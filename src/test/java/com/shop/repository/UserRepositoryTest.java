package com.shop.repository;


import com.shop.repository.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class UserRepositoryTest {

    @Autowired UserRepository userRepository;


    @Test
    @Order(1)
    @DisplayName("C")
    void createUser(){
        UserDto userDto = UserDto.createUser("testhhh24Email@google.com", "pwd2", "sojin");

        System.out.println(userDto);
        System.out.println(userRepository.insert(userDto));
    }

    @Test
    @Order(2)
    @DisplayName("R")
    void findAllUser(){
        printList(userRepository.findAll());
    }

    void printList(List<UserDto> users){
        users.forEach(System.out::println);
    }

    @Test
    @Order(3)
    @DisplayName("U")
    void modify(){
        UserDto userDto = UserDto.updateAddress(2L, "123456", "sample", "sample, smaple");

        System.out.println(userDto);
        System.out.println(userRepository.modify(userDto));
    }

    @Test
    @Order(4)
    @DisplayName("D")
    void delete(){
        System.out.println(userRepository.delete(7L));
    }

}
