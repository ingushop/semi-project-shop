package com.shop.repository;

import com.shop.repository.dto.Inquiry;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InquiryRepository {

    List<Inquiry> findByTypes(@Param("types") String... types);
    Inquiry findById(Long id);
    Integer save(Inquiry inquiry);
    Integer updateStatusToDeleted(Long id);
}
