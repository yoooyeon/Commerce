package com.yooyeon.commerce.domain.area.repository;

import com.yooyeon.commerce.domain.area.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {
    Optional<Area> findById(Long id);

    Area save(Area entity);
}