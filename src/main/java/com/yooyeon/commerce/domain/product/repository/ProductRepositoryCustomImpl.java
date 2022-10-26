package com.yooyeon.commerce.domain.product.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.yooyeon.commerce.domain.category.entity.QCategory;
import com.yooyeon.commerce.domain.product.entity.Product;
import com.yooyeon.commerce.domain.product.entity.QProduct;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class ProductRepositoryCustomImpl implements ProductRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    public ProductRepositoryCustomImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<Product> findByCategoryId(Long categoryId) {
        return queryFactory
                .select(QProduct.product)
                .from(QProduct.product)
                .join(QCategory.category, QProduct.product.category)
                .fetch();
    }
}