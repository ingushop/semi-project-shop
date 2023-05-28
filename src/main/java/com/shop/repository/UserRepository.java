package com.shop.repository;

import com.shop.repository.dto.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    List<UserDTO> findAll();
    Integer insert(UserDTO userDTO);
    Integer modify(UserDTO userDTO);
    Integer delete(Long id);
}
