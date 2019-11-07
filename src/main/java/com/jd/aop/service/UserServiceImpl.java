package com.jd.aop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl {


    public void test() {
        log.info("test aop");
    }

    public void login(String username, String password) {
        log.info("username: {}, password: {}", username, password);
    }

}
