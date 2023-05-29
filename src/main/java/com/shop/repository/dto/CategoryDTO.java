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

    @Builder
    public CategoryDTO(Long id, Long parentId, String contents, Integer depth) {
        this.id = id;
        this.parentId = parentId;
        this.contents = contents;
        this.depth = depth;
    }
}// end class
