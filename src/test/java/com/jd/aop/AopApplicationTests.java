package com.jd.aop;


import com.jd.aop.service.EmailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AopApplicationTests {

	@Autowired
	EmailService emailService;
	


	@Test
	public void fun() {
		emailService.sendEmail();
		emailService.sayHello("xuzhangwang");
	}

}
