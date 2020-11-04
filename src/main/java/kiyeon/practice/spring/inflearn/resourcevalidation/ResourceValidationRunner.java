package kiyeon.practice.spring.inflearn.resourcevalidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class ResourceValidationRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // 변수로 받는 configuratin은 getResource와 마찬가지로 location 역할을 함
        // configLocation은 내부적으로 Resource 객체로 변환이 됨
//        ClassPathXmlApplicationContext cpCtx = new ClassPathXmlApplicationContext("slein.xml");
//        FileSystemXmlApplicationContext fsCtx = new FileSystemXmlApplicationContext("xxx.xml");
//        System.out.println(resourceLoader.getClass());

        Resource resource = resourceLoader.getResource("classpath:test.txt");
        // 스프링 부트 기반일 경우 classpath가 설정되지 않아 인식할 수 없음
//        Resource resource = resourceLoader.getResource("test.txt");
//        System.out.println(resource.getClass());
//
//        System.out.println(resource.exists());
//        System.out.println(resource.getDescription());
//        Files.readString(Path.of(resource.getURI()));
    }
}
