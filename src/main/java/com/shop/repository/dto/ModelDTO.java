package com.shop.repository.dto;

import lombok.*;

import java.time.LocalDateTime;

//@Data
@Getter
@NoArgsConstructor
@ToString
public class ModelDTO {

    private Long id;
    private String code;
    private Long categoryId;
    private String name;
    private String contents;
    private Long price;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    @Builder
    public ModelDTO(Long id, String code, Long categoryId, String name, String contents,
                    Long price, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.code = code;
        this.categoryId = categoryId;
        this.name = name;
        this.contents = contents;
        this.price = price;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }// constructor


}// end class
