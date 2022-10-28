package com.yooyeon.commerce.domain.user.service;
import com.yooyeon.commerce.domain.user.dto.JoinUserRequestDto;
import com.yooyeon.commerce.domain.user.dto.LoginDto;
import com.yooyeon.commerce.domain.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface UserService {

    Long join(JoinUserRequestDto requestUserDto);
    User getMemberLoginCheck(LoginDto loginDto);
}