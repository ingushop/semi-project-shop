package com.shop.repository.dto;


import lombok.*;

//@Data
@Getter
@NoArgsConstructor
@ToString
public class CategoryDTO {

    private Long id;
    private Long parentId;
    private String contents;
    private Integer depth;

}// end class
