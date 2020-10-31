package kiyeon.practice.spring.inflearn.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
//@Service
public class ProxySimpleEventService implements EventService {

//    @Autowired
    SimpleEventService simpleEventService;

    @Override
    public void createEvent() {
        long begin = System.currentTimeMillis();
        simpleEventService.createEvent(); // 위임 - delegation
        System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void publishEvent() {
        long begin = System.currentTimeMillis();
        simpleEventService.publishEvent(); // 위임 - delegation
        System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void deleteEvent() {
        long begin = System.currentTimeMillis();
        simpleEventService.deleteEvent(); // 위임 - delegation
        System.out.println(System.currentTimeMillis() - begin);
    }
}
