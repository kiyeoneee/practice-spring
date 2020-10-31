package kiyeon.practice.spring.inflearn.environment;

//@Configuration
//@Profile("test") // -Dspring.profiles.active="test"
public class TestConfiguration {
//    @Bean
//    @Profile("test")
    public BookRepository bookRepository() {
        return new TestBookRepository();
    }
}
