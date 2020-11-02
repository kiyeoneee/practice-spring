package kiyeon.practice.spring.inflearn.aop.eventpublisher;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
// 스프링 4.2 이전까진 꼭 상속
//public class MyEventHandler implements ApplicationListener<MyEvent> {
public class MyEventHandler {

//    스프링 4.2 이전
//    @Override
//    public void onApplicationEvent(MyEvent event) {
//        System.out.println("이벤트 받았다. 데이터는 " + event.getData());
//    }

    @EventListener
    @Async
//    @Order(Ordered.HIGHEST_PRECEDENCE)
    public void handle(MyEvent event) {
        System.out.println(Thread.currentThread());
        System.out.println("이벤트 받았다. 데이터는 " + event.getData());
    }
}
