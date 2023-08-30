package com.example.restservice.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PostInfoJsonRq {
    private String firstName;
    private String lastName;
}