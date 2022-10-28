package com.yooyeon.commerce.domain.user.service;
import com.yooyeon.commerce.domain.history.entity.PurchaseHistory;
import com.yooyeon.commerce.domain.history.entity.SalesHistory;
import com.yooyeon.commerce.domain.history.repository.PurchaseHistoryRepository;
import com.yooyeon.commerce.domain.history.repository.SalesHistoryRepository;
import com.yooyeon.commerce.domain.product.dto.ProductDto;
import com.yooyeon.commerce.domain.product.entity.Product;
import com.yooyeon.commerce.domain.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.yooyeon.commerce.domain.product.dto.ProductDto.*;


@Service
@RequiredArgsConstructor
public class MyPageServiceImpl implements MyPageService{
    private final PurchaseHistoryRepository purchaseHistoryRepository;
    private final SalesHistoryRepository salesHistoryRepository;
    private final ProductRepository productRepository;

    @Override
    public List<Detail> getMyPurchaseHistory(String userEmail) {
        List<PurchaseHistory> purchaseHistoryList = purchaseHistoryRepository.findByUserEmail(userEmail);
        List<Detail> productDetailList = new ArrayList<Detail>();

        for(PurchaseHistory list : purchaseHistoryList) {
            Long productId = list.getProductId();
            Optional<Product> result = productRepository.findById(productId);
            Product product = result.get();
            Detail productDetail = Detail.builder().build().toDto(product);
            productDetailList.add(productDetail);
        }


        return productDetailList;
    }

    @Override
    public List<Detail> getMySalesHistory(String userEmail) {
        List<SalesHistory> salesHistoryList = salesHistoryRepository.findByUserEmail(userEmail);
        List<Detail> productDetailList = new ArrayList<Detail>();

        for(SalesHistory list : salesHistoryList) {
            Long productId = list.getProductId();
            Optional<Product> result = productRepository.findById(productId);
            Product product = result.get();
            Detail productDetail = Detail.builder().build().toDto(product);
            productDetailList.add(productDetail);
        }

        return productDetailList;

    }
}