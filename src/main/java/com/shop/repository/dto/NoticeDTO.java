package com.shop.repository.dto;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NoticeDTO {

    private Long id;
    private Long createdBy;
    private Long lastModifiedBy;
    private String title;
    private String contents;
    private String status;
    private LocalDateTime openedDate;
    private LocalDateTime expireDate;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;


    @Builder
    public NoticeDTO(Long id, Long createdBy, Long lastModifiedBy, String title, String contents, String status,
                     LocalDateTime openedDate, LocalDateTime expireDate, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.createdBy = createdBy;
        this.lastModifiedBy = lastModifiedBy;
        this.title = title;
        this.contents = contents;
        this.status = status;
        this.openedDate = openedDate;
        this.expireDate = expireDate;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }// constructor


}// end class
