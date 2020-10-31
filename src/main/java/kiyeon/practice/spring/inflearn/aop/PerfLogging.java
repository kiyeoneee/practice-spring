package kiyeon.practice.spring.inflearn.aop;

import java.lang.annotation.*;

// 이 애노테이션 정보를 얼마나 유지 할 지에 대한 규칙
// default : CLASS
@Retention(RetentionPolicy.CLASS)
@Documented
@Target(ElementType.METHOD)
public @interface PerfLogging {

}
