package com.project.study.utils.trace;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


@Aspect
@Slf4j
public class ProdLogTraceAspect implements LogTraceAspect{


    private final LogTrace logTrace;
    public ProdLogTraceAspect(LogTrace logTrace) {
        this.logTrace = logTrace;
    }


    @Around("execution(* com.project.study..*(..)) && !execution(* com.project.study.config..*(..))")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        TraceStatus status = null;

        try {
            String message = joinPoint.getSignature().toShortString();
            status = logTrace.begin(message);
            //로직 호출
            Object result = joinPoint.proceed();
            logTrace.end(status);
            return result;
        } catch (Exception e) {
            logTrace.exception(status, e);
            throw e;
        }
    }


}
