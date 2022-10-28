package com.yooyeon.commerce.domain.user.api;

import com.yooyeon.commerce.domain.user.dto.JoinUserRequestDto;
import com.yooyeon.commerce.domain.user.dto.LoginDto;
import com.yooyeon.commerce.domain.user.entity.User;
import com.yooyeon.commerce.domain.user.service.UserService;
import com.yooyeon.commerce.global.common.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1.0")
@RequiredArgsConstructor
public class UserApi {

    private final UserService userService;

    //회원가입
    @PostMapping("/join")
    public Long join(@RequestBody JoinUserRequestDto requestUserDto){
        return userService.join(requestUserDto);
    }

    //로그인
    @PostMapping("/login")
    public ApiResponse<User> login(@RequestBody LoginDto loginDto){
        User response = userService.getMemberLoginCheck(loginDto);
        return ApiResponse.createSuccess(response);
    }
}