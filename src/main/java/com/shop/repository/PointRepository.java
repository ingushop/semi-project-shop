package com.shop.repository;


import com.shop.repository.dto.PointDTO;
import com.shop.repository.dto.ProductDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PointRepository {

    List<PointDTO> findAll();
    PointDTO findById(@Param("id") Long id);
    Integer insert(PointDTO pointDTO);
    Integer modify(PointDTO pointDTO);
    Integer deleteById(@Param("id") Long id);

}// end interface
