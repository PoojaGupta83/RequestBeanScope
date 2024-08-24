package com.scope.example.singleton.controller;

import com.scope.example.singleton.entity.User;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    private static final Logger log= LoggerFactory.getLogger(UserController.class);

    public UserController(){
        log.info("User Controller initialized");
    }

    @PostConstruct
    public void init(User user){
        log.info("User controller hashCode:{} User hashCode:{}",this.hashCode(),user.hashCode());
    }

    @GetMapping(value = "/fetchUser1")
    public ResponseEntity<String>getUserDetails(){
        log.info("fetch User Api");
        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }
}
