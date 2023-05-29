package com.shop.repository;


import com.shop.repository.dto.CategoryDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository {

    List<CategoryDTO> findAll();
    CategoryDTO findById(@Param("id")Long id);
    List<CategoryDTO> findByParentId(@Param("parentId")Long parentId);
    List<CategoryDTO> findByContents(@Param("contents")String contents);

    Integer insert(CategoryDTO categoryDTO);
    Integer modify(CategoryDTO categoryDTO);
    Integer deleteById(@Param("id") Long id);

}// end interface
