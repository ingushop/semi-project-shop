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

    public List<Inquiry> findPaymentAndDeliverys(){

        return inquiryRepository.findPaymentAndDeliverys();
    }

    public List<Inquiry> findProducts(){

        return inquiryRepository.findProducts();
    }

    public List<Inquiry> findExchangeAndReturns(){

        return inquiryRepository.findExchangeAndReturns();
    }

    public Inquiry findById(Long id){

        return inquiryRepository.findById(id);
    }

    public Integer register(Inquiry inquiryDTO) {

        return inquiryRepository.register(inquiryDTO);
    }
}
