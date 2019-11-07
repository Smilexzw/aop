package com.jd.aop.service.impl;

import com.jd.aop.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailServiceImpl implements EmailService{

    @Override
    public void sendEmail() {
        String title = "xxx";
        String username = "xxx";
        String email = "1114998422@qq.com";
        log.info("title: {}, username: {}, email: {}", title, username, email);
    }

    public void sayHello(String username) {
        log.info("username: {} sayHello" + username);
    }

}
