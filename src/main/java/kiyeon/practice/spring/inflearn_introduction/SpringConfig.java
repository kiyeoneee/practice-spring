package kiyeon.practice.spring.inflearn_introduction;

import kiyeon.practice.spring.inflearn_introduction.repository.JdbcMemberRepository;
import kiyeon.practice.spring.inflearn_introduction.repository.MemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
        return new JdbcMemberRepository(dataSource);
    }
}
