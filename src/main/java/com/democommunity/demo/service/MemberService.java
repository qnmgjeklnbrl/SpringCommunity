package com.democommunity.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.democommunity.demo.domain.dto.MemberDto;
import com.democommunity.demo.domain.entitiy.MemberEntity;
import com.democommunity.demo.domain.entitiy.MemberRepository;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Transactional
    public int setmember(MemberDto memberDto){

       MemberEntity memberEntity =  memberRepository.save(memberDto.toEntity()); 
       return memberEntity.getMno();    
    }
    
}
