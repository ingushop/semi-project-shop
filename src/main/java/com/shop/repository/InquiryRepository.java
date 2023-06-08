package com.shop.repository;

import com.shop.repository.dto.Inquiry;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InquiryRepository {

    List<Inquiry> findPaymentAndDeliverys();
    List<Inquiry> findProducts();
    List<Inquiry> findExchangeAndReturns();
    Inquiry findById(Long id);
    Integer register(Inquiry inquiryDTO);
    Integer modify(Inquiry inquiryDTO);
    Integer deleteById(Long id);
}
