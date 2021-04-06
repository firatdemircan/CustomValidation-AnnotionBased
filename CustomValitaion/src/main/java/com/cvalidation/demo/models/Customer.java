package com.cvalidation.demo.models;


import com.cvalidation.demo.configure.Cemail;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
public class Customer {


    private int id;

    @NotEmpty //Remember not empty means it cant not be null(If you make it null you accepting the empty too
    private String name;

    @Min(value = 18)
    @Max(value =65)
    private int age;

    @Cemail
    private String email;
}
