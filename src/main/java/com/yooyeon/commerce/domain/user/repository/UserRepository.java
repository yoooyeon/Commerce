package com.yooyeon.commerce.domain.user.repository;

import com.yooyeon.commerce.domain.review.entity.Review;
import com.yooyeon.commerce.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByEmailAndPassword(String email, String pwd);
}