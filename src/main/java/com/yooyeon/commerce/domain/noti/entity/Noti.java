package com.yooyeon.commerce.domain.noti.entity;

import com.yooyeon.commerce.domain.common.BaseTimeEntity;
import com.yooyeon.commerce.domain.common.NotiCode;
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
public class Noti extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "noti_id")
    private Long id;
    private String message;
    private NotiCode code; // 예약, 키워드, 채팅
    // user 매핑

}
