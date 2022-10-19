package com.example.custmngmnt.customermanagement.controller;

import com.example.custmngmnt.customermanagement.dto.CustomerDTO;
import com.example.custmngmnt.customermanagement.dto.request.CustomerSaveRequestDTO;
import com.example.custmngmnt.customermanagement.service.CustomerService;
import com.example.custmngmnt.customermanagement.service.impl.CustomerServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveRequestDTO customerSaveRequestDTO){
        String id = customerService.addCustomer(customerSaveRequestDTO);
        return id;
    }
}
