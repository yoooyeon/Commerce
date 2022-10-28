package com.yooyeon.commerce.domain.reservation.api;
import com.yooyeon.commerce.domain.reservation.dto.ReservationDto;
import com.yooyeon.commerce.domain.reservation.service.ReservationService;
import com.yooyeon.commerce.global.common.ApiResponse;
import com.yooyeon.commerce.global.error.exception.CustomException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1.0/reservations")
public class ReservationApi {

    private final ReservationService reservationService;

    @GetMapping("/{id}")
    public ApiResponse getReservation(@PathVariable Long id){
        return ApiResponse.createSuccess(reservationService.getReservation(id));
    }

    @GetMapping("products/{product_id}")
    public ApiResponse getReservationByProductId(@PathVariable Long product_id){
        try{
            return ApiResponse.createSuccess(reservationService.getReservationByProductId(product_id));
        }catch (CustomException e){
            return ApiResponse.createError(e.getErrorCode());
        }
    }

    @PostMapping()
    public ApiResponse saveReservation(@RequestBody ReservationDto.ReservationCreateRequest request){
        try{
            return ApiResponse.createSuccess(reservationService.saveReservation(request));
        }catch (CustomException e){
            return ApiResponse.createError(e.getErrorCode());
        }
    }

    @DeleteMapping("/{id}")
    public ApiResponse deleteReservation(@PathVariable Long id){
        try{
            return ApiResponse.createSuccess(reservationService.deleteReservation(id));
        }catch (CustomException e){
            return ApiResponse.createError(e.getErrorCode());
        }
    }

}