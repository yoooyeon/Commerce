package com.yooyeon.commerce.domain.user.dto;
import com.yooyeon.commerce.domain.user.entity.Address;
import com.yooyeon.commerce.domain.user.entity.SuedYn;
import com.yooyeon.commerce.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JoinUserRequestDto {

    private String name;
    private String password;
    private String email;
    private Address address;
    private String nickname;
    private int temperature;
    private SuedYn suedYn;

/*    @Builder
    public joinUserRequestDto(String name, String email, Address address, String nickname, int temperature, SuedYn suedYn){
        this.name = name;
        this.email = email;
        this.address = address;
        this.nickname = nickname;
        this.temperature = temperature;
        this.suedYn = suedYn;
    }*/

    public User toEntity(){
        return User.builder()
                .name(name)
                .password(password)
                .email(email)
                .address(address)
                .nickname(nickname)
                .temperature(temperature)
                .suedYn(suedYn)
                .build();
    }
}