package com.example.accountdemo.controller;

import com.example.accountdemo.dto.TransferFormDto;
import com.example.accountdemo.model.Customer;
import com.example.accountdemo.model.User;
import com.example.accountdemo.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/transfer")
public class TransferMoneyController {

    private final CustomerService customerService;

    public TransferMoneyController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public String home(@PathVariable long id, Model model) {

        return customerService.transferView(id, model);
    }

    @PostMapping("/process")
    public String process(TransferFormDto transferFormDto, Model model) {

        return customerService.transferMoney(transferFormDto, model);
    }
}
