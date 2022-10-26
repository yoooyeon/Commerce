package com.yooyeon.commerce.domain.area.entity;

import com.yooyeon.commerce.domain.common.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Area extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "area_id")
    private Long id;

    @Column(name = "area_name")
    private String areaName;
}