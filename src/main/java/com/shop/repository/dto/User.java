package com.shop.repository.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@ToString
public class User {
    private Long id;
    private String email;
    private String pwd;
    private String name;
    private String zip;
    private String address;
    private String addressDetail;
    private String status;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;


    @Builder
    public User(Long id, String email, String pwd, String name, String zip, String address, String addressDetail, LocalDateTime modifiedDate, Long cash, Long point, String status) {
        this.id = id;
        this.email = email;
        this.pwd = pwd;
        this.name = name;
        this.zip = zip;
        this.address = address;
        this.status = status;
        this.addressDetail = addressDetail;
        this.modifiedDate = modifiedDate;
    }

    public static User createUser(String email, String pwd, String name, String zip, String address, String addressDetail) {
        return new User().builder()
                .email(email)
                .pwd(pwd)
                .name(name)
                .zip(zip)
                .address(address)
                .addressDetail(addressDetail)
                .build();
    }

    public static User update(Long id, String pwd, String zip, String address, String addressDetai) {
        return new User().builder()
                .id(id)
                .pwd(pwd)
                .zip(zip)
                .address(address)
                .addressDetail(addressDetai)
                .modifiedDate(LocalDateTime.now())
                .build();
    }

}
