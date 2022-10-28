package com.yooyeon.commerce.domain.user.dto;
import com.yooyeon.commerce.domain.user.entity.Address;
import com.yooyeon.commerce.domain.user.entity.SuedYn;
import com.yooyeon.commerce.domain.user.entity.User;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@AllArgsConstructor
public class UserDto {
    private String name;
    private String password;
    private String email;
    private Address address;
    private String nickname;
    private int temperature;
    private SuedYn suedYn;

    public User toEntity(){
        return User.builder()
                .name(name)
                .email(email)
                .build();
    }
}