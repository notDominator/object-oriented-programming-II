package com.example.Spotty.Service;

import com.example.Spotty.Repository.ParkingSpotRepository;
import com.example.Spotty.Repository.ReservationRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    //dependency injection
    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository){
        this.reservationRepository = reservationRepository;
    }
}
