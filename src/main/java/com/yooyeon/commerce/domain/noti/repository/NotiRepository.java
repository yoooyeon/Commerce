package com.yooyeon.commerce.domain.noti.repository;

import com.yooyeon.commerce.domain.noti.entity.Noti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NotiRepository extends JpaRepository<Noti, Long> {
    Optional<Noti> findById(Long id);

    Noti save(Noti entity);
}