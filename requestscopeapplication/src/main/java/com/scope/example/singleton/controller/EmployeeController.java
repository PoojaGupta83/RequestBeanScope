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
public class EmployeeController {
    public static final Logger log= LoggerFactory.getLogger(EmployeeController.class);


    public EmployeeController(){
        log.info("EmployeeController Init");
    }

    @PostConstruct
    public void init(User user){
        log.info("Employee Controller HashCode :{} User HashCode:{}",this.hashCode(),user.hashCode());
    }
    @GetMapping(value = "/fetchUser")
    public ResponseEntity<String> getUserDetails(){
        log.info("fetch User Api");
        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }
}
