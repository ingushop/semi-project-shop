package com.shop.repository.dto;

import lombok.*;

import java.time.LocalDateTime;

//@Data
@Getter
@NoArgsConstructor
@ToString
public class DeliveryDTO {

    private Long id;
    private Long orderId;
    private String trackingNum;
    private String receiverName;
    private String receiverPhone;
    private String zip;
    private String address;
    private String addressDetail;
    private String status;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;


    @Builder
    public DeliveryDTO(Long id, Long orderId, String trackingNum, String receiverName, String receiverPhone, String zip,
                       String address, String addressDetail, String status, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.orderId = orderId;
        this.trackingNum = trackingNum;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.zip = zip;
        this.address = address;
        this.addressDetail = addressDetail;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.status = status;
    }// constructor

}// end class
