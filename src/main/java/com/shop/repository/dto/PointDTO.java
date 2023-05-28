package com.shop.repository.dto;

import lombok.*;

import java.time.LocalDateTime;

//@Data
@Getter
@NoArgsConstructor
@ToString
public class PointDTO {

    private Long id;
    private Long userId;
    private String causeType;
    private Long causeId;
    private String causeName;
    private Long point;
    private String status;
    private LocalDateTime expireDate;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    @Builder
    public PointDTO(Long id, Long userId, String causeType, Long causeId, String causeName, Long point,
                    String status, LocalDateTime expireDate, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.userId = userId;
        this.causeType = causeType;
        this.causeId = causeId;
        this.causeName = causeName;
        this.point = point;
        this.status = status;
        this.expireDate = expireDate;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }// constructor

}// end class
