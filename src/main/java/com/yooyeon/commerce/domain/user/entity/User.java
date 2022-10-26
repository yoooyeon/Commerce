package com.yooyeon.commerce.domain.user.entity;

import com.yooyeon.commerce.domain.common.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;
    private String password;
    private String name;
    private String email;
    @Embedded
    private Address address;
    private String nickname;
    private int temperature;

    @Column(name = "sued_yn")
    @Enumerated(EnumType.STRING)
    private SuedYn suedYn;

    //private List<Product> products = new ArrayList<>();
}