package com.yooyeon.commerce.domain.reservation.service;

import com.yooyeon.commerce.domain.reservation.dto.ReservationDto;

import java.util.Optional;

public interface ReservationService {
    ReservationDto.ReservationResponse getReservation(Long id);
    ReservationDto.ReservationResponse getReservationByProductId(Long productId);
    ReservationDto.ReservationResponse saveReservation(ReservationDto.ReservationCreateRequest request);
    ReservationDto.ReservationResponse deleteReservation(Long id);
}