package com.example.SpringAOPForJobApp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.example.SpringAOPForJobApp.service.JobService.getAllJobs(..))")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("{} Method was called", jp.getSignature());
    }

    @After("execution(* com.example.SpringAOPForJobApp.service.JobService.getAllJobs(..))")
    public void logAfterMethodCall(JoinPoint jp) {
        LOGGER.info("{} Method completed execution", jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.example.SpringAOPForJobApp.service.JobService.getAllJobs(..))")
    public void logAfterReturnMethodCall(JoinPoint jp) {
        LOGGER.info("{} Method was returned successfully", jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.example.SpringAOPForJobApp.service.JobService.getAllJobs(..))")
    public void logAfterThrowMethodCall(JoinPoint jp) {
        LOGGER.info("Error was thrown in the method {}", jp.getSignature().getName());
    }
}
