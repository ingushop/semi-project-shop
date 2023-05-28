package com.shop.repository;


import com.shop.repository.dto.CategoryDTO;
import com.shop.repository.dto.SizeOptionDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SizeOptionRepository {

    List<CategoryDTO> findAll();
    SizeOptionDTO findById(@Param("id") Long id);
    Integer insert(SizeOptionDTO sizeOptionDTO);
    Integer modify(SizeOptionDTO sizeOptionDTO);
    Integer deleteById(@Param("id") Long id);

}// end interface
