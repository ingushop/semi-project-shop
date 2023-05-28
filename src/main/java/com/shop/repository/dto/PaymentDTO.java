package com.shop.repository.dto;


import lombok.*;

import java.time.LocalDateTime;

//@Data
@Getter
@NoArgsConstructor
@ToString
public class PaymentDTO {

    private Long id;
    private Long userId;
    private Long orderId;
    private Long payment;
    private String status;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;


    @Builder
    public PaymentDTO(Long id, Long userId, Long orderId, Long payment,
                      String status, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.userId = userId;
        this.orderId = orderId;
        this.payment = payment;
        this.status = status;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }// constructor


}// end class
