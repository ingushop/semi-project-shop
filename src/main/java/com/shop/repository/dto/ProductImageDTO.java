package com.shop.repository.dto;

import lombok.*;
import org.springframework.boot.SpringApplicationExtensionsKt;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

//@Data
@Getter
@NoArgsConstructor
@ToString
public class ProductImageDTO {

    private Long id;
    private Long productId;
    private String name;
    private String path;
    private String imageType;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    @Builder
    public ProductImageDTO(Long id, Long productId, String name, String path, String imageType,
                           LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.productId = productId;
        this.name = name;
        this.path = path;
        this.imageType = imageType;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }// constructor

}// end class

