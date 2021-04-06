package com.cvalidation.demo.controller;

import com.cvalidation.demo.models.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/customer")
public class CustomerController {


    @PostMapping("/insert")
    public Map<String, Customer> insert( @Valid @RequestBody Customer customer){
        Map<String,Customer> customerMap = new HashMap<String,Customer>();
        customerMap.put("Result",customer);

        return customerMap;
    }


}
