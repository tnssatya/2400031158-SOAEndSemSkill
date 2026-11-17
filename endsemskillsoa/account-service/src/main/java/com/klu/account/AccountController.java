package com.klu.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ui/internal/account")
public class AccountController {

    @GetMapping("/{id}")
    public String getAccount(@PathVariable String id) {
        return "Account Details: " + id;
    }
}
