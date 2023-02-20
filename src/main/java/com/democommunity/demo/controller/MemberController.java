package com.democommunity.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.democommunity.demo.domain.dto.MemberDto;
import com.democommunity.demo.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired 
    private MemberService memberService;

    @GetMapping("/signup")
    public Resource getsignupPage(){

        return new ClassPathResource("templates/member/signup.html");


    }
    @GetMapping("/login")
    public Resource getloginPage(){

        return new ClassPathResource("templates/member/login.html");


    }
    @PostMapping("/setmember")
    public int setmember(MemberDto memberDto){
        return memberService.setmember(memberDto);


    }

    
    
}
