package com.yooyeon.commerce.domain.product.service;

import com.yooyeon.commerce.domain.product.dto.InterestProductDto;
import com.yooyeon.commerce.domain.product.dto.ProductDto;
import com.yooyeon.commerce.domain.product.dto.ProductDto.Detail;

import java.util.List;

import static com.yooyeon.commerce.domain.product.dto.ProductDto.*;


public interface ProductService {

    List<Detail> findAllProducts();

    Detail findDetailProductByProductId(Long productId);

    CreateResponse addProduct(CreateRequest request);

    void deleteProduct(Long productId);

    Detail updateProduct(Long productId, UpdateRequest request);

    List<Detail> findProductsByCategoryId(Long categoryId);

    InterestProductDto.CreateResponse addInterestProduct(Long productId, Long userId);

}