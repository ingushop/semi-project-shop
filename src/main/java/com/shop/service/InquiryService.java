package com.shop.service;

import com.shop.repository.InquiryRepository;
import com.shop.repository.dto.Inquiry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class InquiryService {

    private final InquiryRepository inquiryRepository;

    public List<Inquiry> findByTypes(String... types){

        return inquiryRepository.findByTypes(types);
    }

    public Inquiry findById(Long id){

        return inquiryRepository.findById(id);
    }

    public Integer save(Inquiry inquiry){

        return inquiryRepository.save(inquiry);
    }

    public Integer updateStatusToDeleted(Long Id) {

        return inquiryRepository.updateStatusToDeleted(Id);
    }

}
