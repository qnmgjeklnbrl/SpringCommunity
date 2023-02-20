package com.democommunity.demo.domain.entitiy;

import com.democommunity.demo.domain.dto.MemberDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="member")
@NoArgsConstructor
@AllArgsConstructor@Getter@Setter@ToString@Builder
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mno;

    @Column(nullable = false)
    private String mid;

    @Column(nullable = false)
    private String mpassword;

    public MemberDto toDto(){
        return MemberDto.builder()
            .mno(this.mno)
            .mid(this.mid)
            .mpassword(this.mpassword)
            .build();


    }



    
}
