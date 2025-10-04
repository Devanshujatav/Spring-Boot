package com.devanshu.SpringAOP;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger LOGGER  = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(public * com.devanshu.SpringAOP.Controller.AlienController.getAliens())")
    public void logBefore(){
        LOGGER.info("getAliens method called from aspect");
    }

//    @After("execution(public * com.devanshu.SpringAOP.Controller.AlienController.getAliens())")
//    public void logAfter(){
//        LOGGER.info("getAliens method executed");
//    }

    @AfterReturning("execution(public * com.devanshu.SpringAOP.Controller.AlienController.getAliens())")
    public void logAfter(){
        LOGGER.info("getAliens Method Executed");
    }

    @AfterThrowing("execution(public * com.devanshu.SpringAOP.Controller.AlienController.getAliens())")
    public void logException(){
        LOGGER.info("ISSUE");
    }
}
