package com.rest1.domain.member.member.entity;

import com.rest1.global.jpa.entity.BaseEntity;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NotEmpty
public class Member extends BaseEntity {

    String username;
    String password;
    String nickname;

    public Member(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }
}
