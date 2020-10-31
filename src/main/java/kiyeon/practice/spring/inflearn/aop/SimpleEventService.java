package kiyeon.practice.spring.inflearn.aop;


import org.springframework.stereotype.Service;

// target 객체 - Real Subject
@Service
public class SimpleEventService implements EventService {
    @Override
//    @PerfLogging
    public void createEvent() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Create an event");
    }

    @Override
//    @PerfLogging
    public void publishEvent() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Published an event");
    }

    @Override
    public void deleteEvent() {
        System.out.println("Delete an event");
    }
}
