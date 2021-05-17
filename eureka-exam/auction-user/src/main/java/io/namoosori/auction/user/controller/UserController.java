package io.namoosori.auction.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String callUser(){
        return "Auction-User Call!!";
    }
}
