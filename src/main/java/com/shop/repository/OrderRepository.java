package com.shop.repository;

import com.shop.repository.dto.OrderDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository {
    List<OrderDTO> findAll();
    Integer insert(OrderDTO orderDTO);
    Integer modify(OrderDTO orderDTO);
    Integer delete(Long id);
}
