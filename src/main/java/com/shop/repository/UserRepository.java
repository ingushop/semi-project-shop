package com.shop.repository;

import com.shop.repository.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    List<UserDto> findAll();
    int insert(UserDto userDto);
    int modify(UserDto userDto);
    int delete(Long id);
}
