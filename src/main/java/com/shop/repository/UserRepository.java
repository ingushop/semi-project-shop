package com.shop.repository;

import com.shop.repository.dto.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    List<User> findAll();
    Integer insert(User userDTO);
    Integer modify(User userDTO);
    Integer delete(Long id);
}
