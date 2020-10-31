package kiyeon.practice.spring.inflearn.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

    // value로는 pointCut 이름을 넘겨주거나 직접 정의
    // 해당 value(메서드)를 감싸는 형태로 적용
    @Around("execution(* kiyeon.practice..*.EventService.*(..))")
//    @Around("@annotation(PerfLogging)")
//    @Around("bean(simpleEventService)")
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        // ProceedingJoinPoint란?
        // Advice가 적용되는 대상 (메서드 자체)
        Object retVal = pjp.proceed();

        System.out.println(System.currentTimeMillis() - begin);
        return retVal;
    }

    @Before("bean(simpleEventService)")
    public void help() {
        System.out.println("hello");
    }
}
