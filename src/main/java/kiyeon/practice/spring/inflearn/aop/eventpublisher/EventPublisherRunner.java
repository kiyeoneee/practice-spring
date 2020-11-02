package kiyeon.practice.spring.inflearn.aop.eventpublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class EventPublisherRunner implements ApplicationRunner {
    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    ApplicationEventPublisher publishEvent;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        applicationContext.publishEvent();
        publishEvent.publishEvent(new MyEvent(this, 100));
    }
}
