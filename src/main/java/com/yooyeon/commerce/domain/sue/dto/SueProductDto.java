package com.yooyeon.commerce.domain.sue.dto;
import com.yooyeon.commerce.domain.sue.entity.SueProduct;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class SueProductDto {

    @NoArgsConstructor
    @Getter
    @Builder
    @AllArgsConstructor
    public static class SueProductResponse{
        private Long id;
        private Long userId;
        private Long productId;
        private LocalDateTime createDate;

        public SueProductResponse toResponse(SueProduct sueProduct){
            return SueProductResponse.builder()
                    .id(sueProduct.getId())
                    .userId(sueProduct.getUser().getId())
                    .productId(sueProduct.getProduct().getId())
                    .createDate(sueProduct.getCreatedDate())
                    .build();
        }
    }

    @NoArgsConstructor
    @Getter
    @Builder
    @AllArgsConstructor
    public static class SueProductDeleteSuccessResponse{
        private String message="Success";
    }
}