package com.yooyeon.commerce.domain.user.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(SpringExtension.class)
@DisplayName("UserImage Domain Test")
class UserImageTest {

    @Test
    void insertUserImageTest() throws Exception {
        // given
        List<UserImage> imageList = new ArrayList<>();
        User user = User.builder().email("test@gmail.com").name("hyy").nickname("mallang").build();
        UserImage image = UserImage.builder().imagePath("test_path").user(user).build();

        // when

        // then

    }

}