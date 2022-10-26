package com.yooyeon.commerce.domain.history.entity;

import com.yooyeon.commerce.domain.common.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sales_history")
public class SalesHistory extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "sales_history_id")
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "user_email")
    private String userEmail;
}