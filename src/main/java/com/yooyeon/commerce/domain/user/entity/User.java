package com.yooyeon.commerce.domain.user.entity;

import com.yooyeon.commerce.domain.common.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    private String password;
    private String name;
    private String email;
    @Embedded
    private Address address;
    private String nickname;
    private long temperature;

    @Enumerated(EnumType.STRING)
    private SuedYn suedYn;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserImage> imageList = new ArrayList<>();
    //private List<Product> products = new ArrayList<>();
}