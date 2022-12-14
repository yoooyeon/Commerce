package com.yooyeon.commerce.domain.review.repository;

import com.yooyeon.commerce.domain.noti.entity.Noti;
import com.yooyeon.commerce.domain.review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    Optional<Review> findById(Long id);

    Review save(Review entity);
}