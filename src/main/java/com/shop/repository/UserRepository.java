package com.shop.repository;

import com.shop.repository.dto.SampleDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SampleRepository {
    SampleDto findAll();
}
