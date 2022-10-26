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
@Table(name="user_image")
public class UserImage extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_image_id")
    private Long id;

    @Column(name = "image_path")
    private String imagePath;

    //private String userId;
}