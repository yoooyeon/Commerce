package com.yooyeon.commerce.domain.reservation.service;
import com.yooyeon.commerce.domain.reservation.dto.ReservationDto;
import com.yooyeon.commerce.domain.reservation.entity.Reservation;
import com.yooyeon.commerce.domain.reservation.repository.ReservationRepository;
import com.yooyeon.commerce.global.error.ErrorCode;
import com.yooyeon.commerce.global.error.exception.CustomException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService{

    private final ReservationRepository reservationRepository;

    @Override
    public ReservationDto.ReservationResponse getReservation(Long id) {
        return ReservationDto.ReservationResponse.builder().build().toReservation(reservationRepository.findById(id).orElseThrow(()->new CustomException(ErrorCode.RESERVATION_NOT_FOUND)));
    }

    @Override
    public ReservationDto.ReservationResponse getReservationByProductId(Long productId) {
        return ReservationDto.ReservationResponse.builder().build().toReservation(
                reservationRepository.findByProductId(productId).orElseThrow(()->new CustomException(ErrorCode.RESERVATION_NOT_FOUND))
        );
    }

    @Override
    public ReservationDto.ReservationResponse saveReservation(ReservationDto.ReservationCreateRequest request) {
        return ReservationDto.ReservationResponse.builder().build().toReservation(
                reservationRepository.save(request.toReservation())
        );
    }

    @Override
    public ReservationDto.ReservationResponse deleteReservation(Long id) {
        Reservation reservation=reservationRepository.findById(id).orElseThrow(()->new CustomException(ErrorCode.RESERVATION_NOT_FOUND));
        reservationRepository.delete(reservation);
        return ReservationDto.ReservationResponse.builder().build().toReservation(reservation);
    }
}