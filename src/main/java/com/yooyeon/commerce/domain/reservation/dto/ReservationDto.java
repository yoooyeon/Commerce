package com.yooyeon.commerce.domain.reservation.dto;
import com.yooyeon.commerce.domain.product.entity.Product;
import com.yooyeon.commerce.domain.reservation.entity.Reservation;
import com.yooyeon.commerce.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

public class ReservationDto {

    @NoArgsConstructor
    @Getter
    @Builder
    @AllArgsConstructor
    public static class ReservationCreateRequest{
        private Long userId;
        private Long productId;
        private LocalDate reservationDate;

        public Reservation toReservation(){
            return Reservation.builder()
                    .reservationDate(reservationDate)
                    .user(User.builder().id(userId).build())
                    .product(Product.builder().id(productId).build())
                    .build();
        }
    }

    @NoArgsConstructor
    @Getter
    @Builder
    @AllArgsConstructor
    public static class ReservationResponse{
        private Long id;
        private Long userId;
        private Long productId;
        private LocalDate reservationDate;

        public ReservationResponse toReservation(Reservation reservation){
            return ReservationResponse.builder()
                    .id(reservation.getId())
                    .userId(reservation.getUser().getId())
                    .productId(reservation.getProduct().getId())
                    .reservationDate(reservation.getReservationDate())
                    .build();
        }
    }
}