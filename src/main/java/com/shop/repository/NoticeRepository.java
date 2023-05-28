package com.shop.repository;

import com.shop.repository.dto.NoticeDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepository {
    List<NoticeDTO> findAll();
    Integer insert(NoticeDTO noticeDTO);
    Integer modify(NoticeDTO noticeDTO);
    Integer delete(Long id);
}
