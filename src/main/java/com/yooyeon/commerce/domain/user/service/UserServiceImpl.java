package com.yooyeon.commerce.domain.user.service;

import com.yooyeon.commerce.domain.user.dto.JoinUserRequestDto;
import com.yooyeon.commerce.domain.user.dto.LoginDto;
import com.yooyeon.commerce.domain.user.entity.User;
import com.yooyeon.commerce.domain.user.repository.UserRepository;
import com.yooyeon.commerce.global.error.exception.CustomException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;

import static com.yooyeon.commerce.global.error.ErrorCode.MEMBER_NOT_FOUND;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    //회원 가입
    @Transactional
    public Long join(JoinUserRequestDto userRequestDto){
        Long responseUserId = userRepository.save(userRequestDto.toEntity()).getId();
        return responseUserId;
    }

    //로그인
    public User getMemberLoginCheck(LoginDto loginDto){

        Optional<User> result = userRepository.findByEmailAndPassword(loginDto.getEmail(), loginDto.getPassword());
        User user = result.get();

        if(user!=null)
            return user;
        else
            throw new CustomException(MEMBER_NOT_FOUND);
    }
}