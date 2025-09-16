package com.rest1.domain.member.member.entity;

import com.rest1.global.jpa.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Member extends BaseEntity {

    String username;
    String password;
    String nickname;

    public Member(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }

    public String getName() {
        return nickname;
    }
}
