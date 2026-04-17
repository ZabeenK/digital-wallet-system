package com.example.wallet;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wallet")
public class WalletController {

    @GetMapping("/balance")
    public String getBalance() {
        return "Balance: 1000";
    }

    @PostMapping("/add")
    public String addMoney(@RequestParam int amount) {
        return "Added: " + amount;
    }
}
