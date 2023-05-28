package com.shop.repository.dto;

import lombok.*;

import java.time.LocalDateTime;

//@Data
@Getter
@NoArgsConstructor
@ToString
public class ProductDTO {

    private Long id;
    private Long modelId;
    private Long color;
    private String code;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    @Builder
    public ProductDTO(Long id, Long modelId, Long color, String code,
                      LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.modelId = modelId;
        this.color = color;
        this.code = code;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }// constructor

}// end class

