package com.yooyeon.commerce.domain.user.api;
import com.yooyeon.commerce.domain.user.service.MyPageService;
import com.yooyeon.commerce.global.common.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static com.yooyeon.commerce.domain.product.dto.ProductDto.*;

@RestController
@RequestMapping("/api/v1.0")
@RequiredArgsConstructor
public class MyPageApi {
    private final MyPageService myPageService;

    @GetMapping("/purchases/{userEmail}")
    public ApiResponse<List<Detail>> getMyPurchasedProducts(@PathVariable String userEmail) {
        List<Detail> productList = myPageService.getMyPurchaseHistory(userEmail);
        return ApiResponse.createSuccess(productList);
    }

    @GetMapping("/sales/{userEmail}")
    public ApiResponse<List<Detail>> getMySoldProducts(@PathVariable String userEmail) {
        List<Detail> productList = myPageService.getMySalesHistory(userEmail);
        return ApiResponse.createSuccess(productList);
    }
}