package com.shop.repository;


import com.shop.repository.dto.Inquiry;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class InquiryRepositoryTest {

    @Autowired InquiryRepository inquiryRepository;


    @Test
    @DisplayName("C")
    void register(){

        for(int i = 0; i < 100; i++) {

            Inquiry exchangeInqiry = Inquiry.builder()
                    .userId(1l)
                    .type("EXCHANGE")
                    .title("test TITLE" + (int) (Math.random() * 1024))
                    .contents("CONTENTS" + (int) (Math.random() * 1024))
                    .secret(false)
                    .build();

            inquiryRepository.register(exchangeInqiry);

            Inquiry deliveryInquiry = Inquiry.builder()
                    .userId(1l)
                    .type("DELIVERY")
                    .title("test TITLE" + (int) (Math.random() * 1024))
                    .contents("CONTENTS" + (int) (Math.random() * 1024))
                    .secret(false)
                    .build();

            inquiryRepository.register(deliveryInquiry);

            Inquiry productInquiry = Inquiry.builder()
                    .userId(1l)
                    .type("RPODUCT_SIZE")
                    .title("test TITLE" + (int) (Math.random() * 1024))
                    .contents("CONTENTS" + (int) (Math.random() * 1024))
                    .secret(false)
                    .build();

            inquiryRepository.register(productInquiry);
        }
    }

    @Test
    @DisplayName("R")
    void findAll(){
        System.out.println("findExchangeAndReturns");
        printList(inquiryRepository.findExchangeAndReturns());
        System.out.println("findPaymentAndDeliverys");
        printList(inquiryRepository.findPaymentAndDeliverys());
        System.out.println("findProducts");
        printList(inquiryRepository.findProducts());
    }

    void printList(List<?> list){
        list.forEach(System.out::println);
    }

    @Test
    @DisplayName("U")
    void modify(){
        ;;
    }

    @Test
    @DisplayName("D")
    void delete(){
        ;;
    }

}