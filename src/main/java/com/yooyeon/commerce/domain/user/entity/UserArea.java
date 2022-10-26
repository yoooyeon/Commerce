package com.yooyeon.commerce.domain.user.entity;

import com.yooyeon.commerce.domain.common.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_area_mpng")
public class UserArea extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_area_id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "area_id")
    private Long areaId;

    //private List<User> userList = new ArrayList<>();
    //private List<Area> areaList = new ArrayList<>();
}