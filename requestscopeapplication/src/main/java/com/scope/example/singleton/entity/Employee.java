package com.scope.example.singleton.entity;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {
    public static final Logger log= LoggerFactory.getLogger(Employee.class);

    public Employee(){
        log.info("Employee Initialized");
    }
    @PostConstruct
    public void init(){
        log.info("Employee Object HashCode:{}",this.hashCode());
    }

}
