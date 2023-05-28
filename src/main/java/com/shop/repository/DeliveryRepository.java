package com.shop.repository;

import com.shop.repository.dto.DeliveryDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryRepository {
    List<DeliveryDTO> findAll();
    Integer insert(DeliveryDTO deliveryDTO);
    Integer modify(DeliveryDTO deliveryDTO);
    Integer delete(Long id);
}
