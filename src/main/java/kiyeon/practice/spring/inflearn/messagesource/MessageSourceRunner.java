package kiyeon.practice.spring.inflearn.messagesource;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

//@Component
public class MessageSourceRunner implements ApplicationRunner {

    final MessageSource messageSource;

    public MessageSourceRunner(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Environment environment = ctx.getEnvironment();
//        System.out.println(environment.getProperty("app.name"));
//        System.out.println(environment.getProperty("app.about"));
//        System.out.println(messageSource.getMessage("greeting", new String[]{"kiyeon"}, Locale.KOREA));
//        System.out.println(messageSource.getMessage("greeting", new String[]{"kiyeon"}, Locale.getDefault()));
//        messageSource.getMessage("greeting", new String[]{"kiyeon"}, Locale.getDefault());
    }
}
