package kiyeon.practice.spring.inflearn.aop.eventpublisher;

import org.springframework.context.ApplicationEvent;

// 스프링 4.2 이전까진 꼭 상속
//public class MyEvent extends ApplicationEvent {
public class MyEvent {
    private int data;

    // Event를 발생시킬 source
    private Object source;

// ApplicationEvent 상속받을 때 필
//    public MyEvent(Object source) {
//        super(source);
//    }
//
//    public MyEvent(Object source, int data) {
//        super(source);
//        this.data = data;
//    }

    // 비침투성 - 스프링 코드가 없어도 됨, 스프링이 추구하는 철
    public MyEvent(Object source, int data) {
        this.source = source;
        this.data = data;
    }

    public Object getSource() {
        return source;
    }

    public int getData() {
        return data;
    }
}
