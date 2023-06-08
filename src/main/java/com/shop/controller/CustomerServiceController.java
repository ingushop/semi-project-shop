package com.shop.controller;


import com.shop.service.IncuiryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
@RequestMapping("/cs")
public class CustomerServiceController {

    private final IncuiryService inquiryService;



    @GetMapping
      public String showCustomerServiceHomel(Model model){

        return "customer-service/home";
    }

    @GetMapping("payment-delivery")
    public String showPaymetAndDelivery(Model model){

        model.addAttribute("pageName","결제 및 배송 문의");
        model.addAttribute("inquirys",inquiryService.getPaymentAndDeliverys());

        return "customer-service/inquiry-list";
    }

    @GetMapping("product")
    public String showProduct(Model model){

        model.addAttribute("pageName","상품 관련 문의");
        model.addAttribute("inquirys",inquiryService.getProducts());

        return "customer-service/inquiry-list";
    }

    @GetMapping("exchange-return")
    public String showxChangeReturn(Model model){

        model.addAttribute("pageName","교환 및 반품 문의");
        model.addAttribute("inquirys",inquiryService.getExchangeAndReturns());

        return "customer-service/inquiry-list";
    }

    @GetMapping("inquiry/{id}")
    public String showInquiryDetail(Model model, @PathVariable("id") Long inquiryId){

        model.addAttribute("pageName","문의하기");
        model.addAttribute("inquiry",inquiryService.getById(inquiryId));

        return "customer-service/inquiry-detail";
    }

    @GetMapping("inquiry/register")
    public String showRegisterForm(Model model){

        model.addAttribute("pageName","문의하기");

        return "customer-service/register";
    }

    @PostMapping("inquiry/register")
    public String registerInquiry(Model model){

        model.addAttribute("pageName","문의하기");

        return "customer-service/register";
    }

}
