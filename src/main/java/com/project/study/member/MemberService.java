package com.project.study.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MemberService {

    public String signup(){

        log.info("회원가입이 완료되었습니다");

        return "ok";
    }
}
