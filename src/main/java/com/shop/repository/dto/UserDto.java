package com.shop.repository.dto;

import lombok.*;

import java.sql.Timestamp;

@Getter
@NoArgsConstructor
@ToString
public class UserDto {
    private Long id;
    private String email;
    private String pwd;
    private String name;
    private String zip;
    private String address;
    private String address_detail;
    private String status;
    private Timestamp created_dt;
    private Timestamp modified_dt;


    @Builder
    public UserDto(Long id,String email, String pwd, String name, String zip, String address, String address_detail, Timestamp modified_dt, Long cash, Long point, String status) {
        this.id = id;
        this.email = email;
        this.pwd = pwd;
        this.name = name;
        this.zip = zip;
        this.address = address;
        this.status = status;
        this.address_detail = address_detail;
        this.modified_dt = modified_dt;
    }

    public static UserDto createUser(String email, String pwd, String name){
        return new UserDto().builder()
                .email(email)
                .pwd(pwd)
                .name(name)
                .build();
    }

    public static UserDto updateAddress(Long id, String zip, String address, String address_detai){
        return new UserDto().builder()
                .id(id)
                .zip(zip)
                .address(address)
                .address_detail(address_detai)
                .modified_dt(new Timestamp(2099,12,31,0,0,0,0))
                .build();
    }

    public static UserDto updateCash(Long id, Long cash){
        return new UserDto().builder()
                .id(id)
                .cash(cash)
                .modified_dt(new Timestamp(System.currentTimeMillis()))
                .build();
    }

    public static UserDto updatePoint(Long id, Long point){
        return new UserDto().builder()
                .id(id)
                .point(point)
                .modified_dt(new Timestamp(System.currentTimeMillis()))
                .build();
    }


}
