package com.shop.repository;

import com.shop.repository.dto.PaymentDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository {
    List<PaymentDTO> findAll();
    Integer insert(PaymentDTO paymentDTO);
    Integer modify(PaymentDTO paymentDTO);
    Integer delete(Long id);
}
