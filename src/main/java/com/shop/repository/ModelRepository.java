package com.shop.repository;


import com.shop.repository.dto.ModelDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository {

    List<ModelDTO> findAll();
    ModelDTO findById(@Param("id") Long id);
    List<ModelDTO> findByCategoryId(@Param("categoryId") Long categoryId);
    ModelDTO findByName(@Param("name") String name);
    Integer insert(ModelDTO modelDTO);
    Integer modify(ModelDTO modelDTO);
    Integer deleteById(@Param("id") Long id);

}// end interface
