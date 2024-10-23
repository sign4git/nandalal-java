package com.example.SpringAOPForJobApp.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {

    private final static Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.example.SpringAOPForJobApp.service.JobService.findById(..))" +
            "&& args(postId)")
    public Object validateAndUpdate(ProceedingJoinPoint pjp, Integer postId) throws Throwable {
        if (postId < 0) {
            LOGGER.info("{} is negative in method {}", postId, pjp.getSignature().getName());
            postId = -postId;
            LOGGER.info("postId is now {}", postId);
        }
        Object obj = pjp.proceed(new Object[]{postId});
        return obj;
    }
}
