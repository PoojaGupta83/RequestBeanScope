package com.scope.example.singleton.entity;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/*creating bean*/
@Component
@Scope(value = "request",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class User {
    public static final Logger log= LoggerFactory.getLogger(User.class);
    public User(){
        log.info("User initialized");
    }

    @PostConstruct
    public void init(){
        log.info("User Object HashCode:{}",this.hashCode());
    }
}
