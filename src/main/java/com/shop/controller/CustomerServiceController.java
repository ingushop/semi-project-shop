package com.shop.controller;


import com.shop.repository.dto.Inquiry;
import com.shop.service.InquiryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
@RequestMapping("/cs")
public class CustomerServiceController {

    private final InquiryService inquiryService;



    @GetMapping
      public String showCustomerServiceHomel(){

        return "customer-service/home";
    }

    @GetMapping("exchange-return")
    public String showExchangeReturn(Model model){

        model.addAttribute("inquirys",inquiryService.findExchangeAndReturns());

        return "customer-service/exchange-return-list";
    }

    @GetMapping("exchange-return/{id}")
    public String showExchangeReturnDetail(Model model, @PathVariable("id") Long inquiryId){

        model.addAttribute("inquiry",inquiryService.findById(inquiryId));

        return "customer-service/product";
    }

    @GetMapping("exchange-return/register")
    public String showExchangeReturnRegisterForm(Inquiry inquiryDto, Model model){

        model.addAttribute("inquiry", inquiryDto);

        return "customer-service/exchange-return-register-form";
    }

    @GetMapping("payment-delivery")
    public String showPaymetAndDelivery(Model model){

        model.addAttribute("inquirys",inquiryService.findPaymentAndDeliverys());

        return "customer-service/payment-delivery-list";
    }

    @GetMapping("payment-delivery/{id}")
    public String showPaymetAndDeliveryDetail(Model model, @PathVariable("id") Long inquiryId){

        model.addAttribute("inquiry",inquiryService.findById(inquiryId));

        return "customer-service/product";
    }

    @GetMapping("payment-delivery/register")
    public String showPaymetAndDeliveryRegisterForm(Inquiry inquiryDto, Model model){

        model.addAttribute("inquiry", inquiryDto);

        return "customer-service/payment-delivery-register-form";
    }

    @GetMapping("product")
    public String showProduct(Model model){

        model.addAttribute("inquirys",inquiryService.findProducts());

        return "customer-service/product-list";
    }

    @GetMapping("product/{id}")
    public String showProductDetail(Model model, @PathVariable("id") Long inquiryId){

        model.addAttribute("inquiry",inquiryService.findById(inquiryId));

        return "customer-service/product";
    }

    @GetMapping("product/register")
    public String showProductRegisterForm(Inquiry inquiryDto, Model model){

        model.addAttribute("inquiry", inquiryDto);

        return "customer-service/product-register-form";
    }

    @PostMapping("inquiry/register")
    public String registerInquiry(@ModelAttribute("inquiry") Inquiry inquiryDto){

        long inquiryId = inquiryService.register(inquiryDto);

        switch (inquiryDto.getType()){
            case "EXCHANGE", "RETURN" -> {
                return "redirect:/cs/exchange-return/" + inquiryId;
            }
            case "PAYMENT", "DELIVERY" -> {
                return "redirect:/cs/payment-delivery/" + inquiryId;
            }
            case "RPODUCT_SIZE", "PRODUCT_RESTOCK" -> {
                return "redirect:/cs/product/" + inquiryId;
            }
        }

        return "redirect:/cs";
    }

    @DeleteMapping("*/{id}/delete")
    public String deleteInquiry(@PathVariable("id") Long inquiryId){

        inquiryService.delete(inquiryId);

        return "redirect:/cs";
    }


}
