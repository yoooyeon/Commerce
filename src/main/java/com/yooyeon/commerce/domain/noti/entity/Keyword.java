package com.yooyeon.commerce.domain.noti.entity;

import com.yooyeon.commerce.domain.common.BaseTimeEntity;
import com.yooyeon.commerce.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Keyword extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "keyword_id")
    private Long id;
    private String keyword;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
