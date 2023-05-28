package com.shop.repository;


import com.shop.repository.dto.ProductDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {

    List<ProductDTO> findAll();
    ProductDTO findById(@Param("id") Long id);
    Integer insert(ProductDTO productDTO);
    Integer modify(ProductDTO productDTO);
    Integer deleteById(@Param("id") Long id);

}// end interface
