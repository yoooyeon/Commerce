package com.yooyeon.commerce.domain.sue.service;

import com.yooyeon.commerce.domain.sue.dto.SueProductDto;

import java.util.List;

import static com.yooyeon.commerce.domain.sue.dto.SueProductDto.*;

public interface SueProductService {
    SueProductResponse getSueProduct(Long id);
    List<SueProductResponse> getSueproductListByProductId(Long productId);
    List<SueProductResponse> getSueproductListByUserId(Long userId);
    SueProductDeleteSuccessResponse deleteAllSueProductByProductId(Long productId);
    SueProductDeleteSuccessResponse deleteAllSueProductByUserId(Long userId);
}