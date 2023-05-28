package com.shop.repository;


import com.shop.repository.dto.ProductImageDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductImageRepository {

    List<ProductImageDTO> findAll();
    ProductImageDTO findById(@Param("id")Long id);
    Integer insert(ProductImageDTO productImageDTO);
    Integer modify(ProductImageDTO productImageDTO);
    Integer deleteById(Long id);

}// end interface
