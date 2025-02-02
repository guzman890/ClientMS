package com.backend.client.model.dto;

import lombok.Data;

@Data
public class PersonDTO {
    private Long id;
    private String name;
    private String gender;
    private int age;
    private String identification;
    private String address;
    private String phone;
}