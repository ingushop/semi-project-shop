package com.shop.crud;


import com.shop.repository.UserRepository;
import com.shop.repository.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class crudTest {

    @Autowired UserRepository userRepository;

    @Test
    @Order(1)
    @DisplayName("creat")
    void createUser(){
        UserDto userDto = UserDto.createUser("test4Email@google.com", "pwd2", "test-min");

        System.out.println(userDto);
        System.out.println(userRepository.insert(userDto));
    }

    @Test
    @Order(2)
    @DisplayName("findAll")
    void findAllUser(){
        System.out.println(userRepository.findAll().toString());
    }

}
