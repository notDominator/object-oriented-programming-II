package com.example.Spotty.Service;

import com.example.Spotty.Repository.ParkingSpotRepository;
import org.springframework.stereotype.Service;
import com.example.Spotty.Model.ParkingSpot;
import java.util.List;
import java.util.Optional;

@Service
public class ParkingService {

    //dependecy injection
    private final ParkingSpotRepository parkingSpotRepository;

    public ParkingService(ParkingSpotRepository parkingSpotRepository){ //variable Springboot will call
        this.parkingSpotRepository = parkingSpotRepository;
    }

    // Get all parking spots
    public List<ParkingSpot> getAllParkingSpots() {
        return parkingSpotRepository.findAll();
    }

    // Get a specific parking spot by ID
    public ParkingSpot getParkingSpotById(Long id) {
        Optional<ParkingSpot> spot = parkingSpotRepository.findById(id);
        return spot.orElse(null);
    }

    // Update parking spot status
    public ParkingSpot updateParkingSpotStatus(Long id, ParkingSpot parkingSpot) {

        return null;
    }

    // Update parking spot status based on input (true = occupied, false = free)
    public ParkingSpot updateSpotStatus(Long id, Boolean isOccupied) {

        return null;
    }
}


