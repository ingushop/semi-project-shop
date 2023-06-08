package com.shop.repository;

import com.shop.repository.dto.InquiryDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IncuiryRepository {
    List<InquiryDTO> findAll();
    InquiryDTO findById(Long id);
    Integer insert(InquiryDTO inquiryDTO);
    Integer modify(InquiryDTO inquiryDTO);
    Integer deleteById(Long id);
}
