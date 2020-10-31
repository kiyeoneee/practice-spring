package kiyeon.practice.spring.inflearn.scope;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Single {

    // single 인스턴스가 한번 만들어질 떄 새로운 proto 인스턴스 하나를 가져다 씀
    // 이후에 Single 인스턴스를 사용할 때 마다 proto는 바뀌지 않음
    @Autowired
    private ObjectProvider<Proto> proto;

    public Proto getProto() {
        return proto.getIfAvailable();
    }
}
