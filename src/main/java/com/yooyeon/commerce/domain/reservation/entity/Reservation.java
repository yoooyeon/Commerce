package com.yooyeon.commerce.domain.reservation.entity;

import com.yooyeon.commerce.domain.common.BaseTimeEntity;
import com.yooyeon.commerce.domain.product.entity.Product;
import com.yooyeon.commerce.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private Long id;
    private Date reservationDate;
    @ManyToOne
    @JoinColumn(name = "user_Id")
    private User user;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Product product;
}