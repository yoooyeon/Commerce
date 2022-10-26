package com.yooyeon.commerce.domain.chatting.entity;

import com.yooyeon.commerce.domain.common.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Room extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "room_id")
    private Long id;

    // 상품이랑 매핑
    // 구매자랑 매핑핑
}
