package com.yooyeon.commerce.domain.history.repository;

import com.yooyeon.commerce.domain.history.entity.SalesHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalesHistoryRepository extends JpaRepository<SalesHistory, Long> {
    Optional<SalesHistory> findById(Long id);

    SalesHistory save(SalesHistory entity);
}