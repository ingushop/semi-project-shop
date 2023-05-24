package com.shop.service;

import com.shop.repository.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SampleService {

    private final SampleRepository sampleRepository;


}
