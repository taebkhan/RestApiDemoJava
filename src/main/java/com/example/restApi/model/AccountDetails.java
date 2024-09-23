package com.example.restApi.model;

import lombok.Data;

@Data
public class AccountDetails {
    //property names should always be in lowercare
    Long id;
    String firstname;
    String lastname;
    String aadhaarcard;
    String accounttype;
}
