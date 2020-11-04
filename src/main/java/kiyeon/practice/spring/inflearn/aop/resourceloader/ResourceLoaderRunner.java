package kiyeon.practice.spring.inflearn.aop.resourceloader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;

@Component
public class ResourceLoaderRunner implements ApplicationRunner {

    @Autowired
//    ResourceLoader resourceLoader;
    ApplicationContext resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Resource resource = resourceLoader.getResource("classpath:test.txt");
//        System.out.println(resource.exists());
//        System.out.println(resource.getDescription());
//        Files.readString(Path.of(resource.getURI()));
    }
}
