package com.example.restservice.response;

import lombok.Data;

@Data
public class PostInfoJsonRs {
    private String firstName;
    private String lastName;
    private int age;
    private String work;
    private String job;
    private String programmingLanguages;
}