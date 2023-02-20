package com.democommunity.demo.domain.dto;

import com.democommunity.demo.domain.entitiy.MemberEntity;

import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString @Builder
public class MemberDto {
    private int mno;


    private String mid;



    private String mpassword;



    public MemberEntity toEntity(){

        return MemberEntity.builder()
            .mno(this.mno)
            .mid(this.mid)
            .mpassword(this.mpassword)
            .build();
    }

    
}
