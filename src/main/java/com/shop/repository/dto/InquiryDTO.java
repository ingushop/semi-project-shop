package com.shop.repository.dto;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InquiryDTO {

    private Long id;
    private Long userId;
    private String type;
    private String title;
    private String contents;
    private Boolean secret;
    private String pw;
    private String response;
    private String status;
    private LocalDateTime createdDate;
    private LocalDateTime responsedDate;


    @Builder
    public InquiryDTO(Long id, Long userId, String type, String title, String contents, Boolean secret, String pw, String response, String status, LocalDateTime responsedDate) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.title = title;
        this.contents = contents;
        this.secret = secret;
        this.pw = pw;
        this.response = response;
        this.status = status;
        this.responsedDate = responsedDate;
    }
    

} // end class
