package com.shop.repository.dto;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString
public class Inquiry {

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

}
