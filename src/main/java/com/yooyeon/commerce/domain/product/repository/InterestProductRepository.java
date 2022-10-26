package com.yooyeon.commerce.domain.product.repository;

import com.yooyeon.commerce.domain.product.entity.InterestProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InterestProductRepository extends JpaRepository<InterestProduct, Long> {
    Optional<InterestProduct> findById(Long categoryId);
}