package com.yooyeon.commerce.domain.category.entity;
import com.yooyeon.commerce.domain.common.BaseTimeEntity;
import com.yooyeon.commerce.domain.product.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "category_id")
    private Long id;
    private String name; // 카테고리명

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> productList = new ArrayList<>();
}