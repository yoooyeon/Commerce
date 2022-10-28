package com.yooyeon.commerce.domain.user.service;

import com.yooyeon.commerce.domain.product.dto.ProductDto;

import java.util.List;

import static com.yooyeon.commerce.domain.product.dto.ProductDto.*;

public interface MyPageService {
    List<Detail> getMyPurchaseHistory(String userId);
    List<Detail> getMySalesHistory(String userId);
}