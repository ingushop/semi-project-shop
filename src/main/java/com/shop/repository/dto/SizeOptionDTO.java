package com.shop.repository.dto;


import lombok.*;

import java.time.LocalDateTime;

//@Data
@Getter
@NoArgsConstructor
@ToString
public class SizeOptionDTO {

    private Long id;
    private Long productId;
    private String value;
    private Long price;
    private Long stock;
    private String status;
    private Boolean use;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;


    @Builder
    public SizeOptionDTO(Long id, Long productId, String value, Long price, Long stock,
                         String status, Boolean use, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.productId = productId;
        this.value = value;
        this.price = price;
        this.stock = stock;
        this.status = status;
        this.use = use;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }// constructor

}// end class
