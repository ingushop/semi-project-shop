package com.shop.service;

import com.shop.repository.IncuiryRepository;
import com.shop.repository.dto.InquiryDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class IncuiryService {

    private final IncuiryRepository incuiryRepository;

    public List<InquiryDTO> getPaymentAndDeliverys(){

        return incuiryRepository.findAll();
    }

    public List<InquiryDTO> getProducts(){

        return incuiryRepository.findAll();
    }

    public List<InquiryDTO> getExchangeAndReturns(){

        return incuiryRepository.findAll();
    }

    public InquiryDTO getById(Long id){

        return incuiryRepository.findById(id);
    }

}
