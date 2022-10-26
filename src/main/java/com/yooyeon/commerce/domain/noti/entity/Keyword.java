package com.yooyeon.commerce.domain.noti.entity;

import com.yooyeon.commerce.domain.common.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Keyword extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "Keyword_id")
    private Long id;
    private String keyword;
    // user 매핑
}
