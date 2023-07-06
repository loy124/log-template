package com.project.study.utils.trace;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;


public interface LogTraceAspect {

    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable;
}
