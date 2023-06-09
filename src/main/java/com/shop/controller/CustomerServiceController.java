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

        model.addAttribute("inquirys",inquiryService.findByTypes("EXCHANGE", "RETURN"));

        return "customer-service/exchange-return-list";
    }

    @GetMapping("exchange-return/register")
    public String showExchangeReturnRegisterForm(Model model){

//        model.addAttribute("inquiry", new Inquiry());
        model.addAttribute("inquiry", Inquiry.builder().build());

        return "customer-service/exchange-return-register-form";
    }

    @GetMapping("payment-delivery")
    public String showPaymetAndDelivery(Model model){

        model.addAttribute("inquirys",inquiryService.findByTypes("PAYMENT", "DELIVERY"));

        return "customer-service/payment-delivery-list";
    }

    @GetMapping("payment-delivery/register")
    public String showPaymetAndDeliveryRegisterForm(Model model){

//        model.addAttribute("inquiry", new Inquiry());
        model.addAttribute("inquiry", Inquiry.builder().build());

        return "customer-service/payment-delivery-register-form";
    }

    @GetMapping("product")
    public String showProduct(Model model){

        model.addAttribute("inquirys",inquiryService.findByTypes("RPODUCT_SIZE", "PRODUCT_RESTOCK"));

        return "customer-service/product-list";
    }

    @GetMapping("product/register")
    public String showProductRegisterForm(Model model){

//        model.addAttribute("inquiry", new Inquiry());
        model.addAttribute("inquiry", Inquiry.builder().build());

        return "customer-service/product-register-form";
    }

    @GetMapping("inquiry/{id}")
    public String showInquiryDetail(Model model, @PathVariable("id") Long id){

        Inquiry inquiry = inquiryService.findById(id);

        model.addAttribute("inquiry",inquiry);

        switch (inquiry.getType()){
            case "EXCHANGE", "RETURN" -> {
                return "customer-service/exchange-return";
            }
            case "PAYMENT", "DELIVERY" -> {
                return "customer-service/payment-delivery";
            }
//            case "RPODUCT_SIZE", "PRODUCT_RESTOCK" -> {
            default -> {
                return "customer-service/product";
            }
        }
    }

    @GetMapping("inquiry/{id}/response")
    public String showInquiryReponse(Model model, @PathVariable("id") Long id){

        Inquiry inquiry = inquiryService.findById(id);

        model.addAttribute("inquiry",inquiry);

        switch (inquiry.getType()){
            case "EXCHANGE", "RETURN" -> {
                return "customer-service/exchange-return";
            }
            case "PAYMENT", "DELIVERY" -> {
                return "customer-service/payment-delivery";
            }
//            case "RPODUCT_SIZE", "PRODUCT_RESTOCK" -> {
            default -> {
                return "customer-service/product";
            }
        }
    }

    @PostMapping("inquiry/register")
    public String registerInquiry(Inquiry inquiry){

        System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>>>" + inquiry);

        inquiryService.save(inquiry);

        switch (inquiry.getType()){
            case "EXCHANGE", "RETURN" -> {
                return "redirect:/cs/exchange-return";
            }
            case "PAYMENT", "DELIVERY" -> {
                return "redirect:/cs/payment-delivery";
            }
//            case "RPODUCT_SIZE", "PRODUCT_RESTOCK" -> {
            default -> {
                return "redirect:/cs/product";
            }
        }
    }


    @PatchMapping("*/{id}/delete")
    public String deleteInquiry(@PathVariable("id") Long inquiryId){

        inquiryService.updateStatusToDeleted(inquiryId);

        return "redirect:/cs";
    }

}
