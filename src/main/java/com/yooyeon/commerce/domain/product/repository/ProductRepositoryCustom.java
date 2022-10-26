package com.yooyeon.commerce.domain.product.repository;

import com.yooyeon.commerce.domain.product.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepositoryCustom {
    List<Product> findByCategoryId(Long categoryId);

}