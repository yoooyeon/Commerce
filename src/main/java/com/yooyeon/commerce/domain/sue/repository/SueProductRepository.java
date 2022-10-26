package com.yooyeon.commerce.domain.sue.repository;

import com.yooyeon.commerce.domain.sue.entity.SueProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SueProductRepository extends JpaRepository<SueProduct, Long> {
    Optional<List<SueProduct>> findAllByProductId(Long productId);

    Optional<List<SueProduct>> findAllByUserId(Long userId);

    void deleteAllByProductId(Long productId);

    void deleteAllByUserId(Long userId);
}