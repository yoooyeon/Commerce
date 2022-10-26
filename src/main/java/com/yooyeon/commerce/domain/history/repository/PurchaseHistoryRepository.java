package com.yooyeon.commerce.domain.history.repository;

import com.yooyeon.commerce.domain.history.entity.PurchaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory, Long> {
    Optional<PurchaseHistory> findById(Long id);

    PurchaseHistory save(PurchaseHistory entity);
}