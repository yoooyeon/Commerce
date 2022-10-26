package com.yooyeon.commerce.domain.user.repository;

import com.yooyeon.commerce.domain.user.entity.UserImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserImageRepository extends JpaRepository<UserImage, Long> {
    Optional<UserImage> findById(Long id);

    UserImage save(UserImage entity);
}