package com.shop.repository.dto;

import lombok.*;

import java.time.LocalDateTime;

//@Data
@Getter
@NoArgsConstructor
@ToString
public class ReviewDTO {

    private Long id;
    private Long sizeOptionId;
    private Long userId;
    private Integer rating;
    private String contents;
    private String status;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    @Builder
    public ReviewDTO(Long id, Long sizeOptionId, Long userId, Integer rating, String contents,
                     String status, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.sizeOptionId = sizeOptionId;
        this.userId = userId;
        this.rating = rating;
        this.contents = contents;
        this.status = status;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }// constructor

}// end class
