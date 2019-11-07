package com.jd.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Slf4j
@Aspect
public class EmailLogger {


    // 定义切点
//    @Pointcut("execution(public * com.jd.aop.service.impl.EmailServiceImpl.*(..))")
//    void vifey() {}

//    @Pointcut("execution(public * com.jd.aop.service.EmailService.*(..))")
//    void vifey() {}

    @Pointcut("execution(public * com.jd.aop.service..*(..))")
    void vifey() {}

//    @Pointcut("execution(public * com.jd.aop.controller.*.*(..))")
//    void vifey() {}

    @Before("vifey()")
    public void doVifey() {
        log.info("aop 切面编程");
    }

}
