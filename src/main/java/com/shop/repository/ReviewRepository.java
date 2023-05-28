package com.shop.repository;


import com.shop.repository.dto.ModelDTO;
import com.shop.repository.dto.ReviewDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository {

    List<ReviewDTO> findAll();
    ReviewDTO findById(@Param("id") Long id);
    Integer insert(ReviewDTO reviewDTO);
    Integer modify(ReviewDTO reviewDTO);
    Integer deleteById(@Param("id") Long id);

}// end interface
