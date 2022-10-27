package com.yooyeon.commerce.domain.noti.entity;

import com.yooyeon.commerce.domain.common.BaseTimeEntity;
import com.yooyeon.commerce.domain.common.NotiCode;
import com.yooyeon.commerce.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
