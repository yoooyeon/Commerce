package com.yooyeon.commerce.domain.area.entity;

import com.yooyeon.commerce.domain.common.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Area extends BaseTimeEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="area_id")
    private Long id;

    @Column(name = "area_name")
    private String areaName;
}