package com.shop.repository.dto;

import lombok.*;

import java.time.LocalDateTime;

//@Data
@Getter
@NoArgsConstructor
@ToString
public class OrderDTO {

    private Long id;
    private Long sizeOptionId;
    private Long userId;
    private Long count;
    private Long price;
    private String status;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;


    @Builder
    public OrderDTO(Long id, Long sizeOptionId, Long userId, Long count, Long price,
                    String status, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.sizeOptionId = sizeOptionId;
        this.userId = userId;
        this.count = count;
        this.price = price;
        this.status = status;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }// constructor

}// end class
