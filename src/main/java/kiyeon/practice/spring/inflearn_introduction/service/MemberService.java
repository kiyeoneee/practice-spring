package kiyeon.practice.spring.inflearn_introduction.service;

import kiyeon.practice.spring.inflearn_introduction.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


}
