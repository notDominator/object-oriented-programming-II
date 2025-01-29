package com.example.Spotty.Controller;

import com.example.Spotty.Repository.ParkingSpotRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Spotty.Model.ParkingSpot;
import com.example.Spotty.Service.ParkingService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/parking-spot")
public class ParkingController {

    //dependency injection
    //@Autowired //field injection
    private final ParkingService parkingService; //variable i called
    //constructor injection
    public ParkingController(ParkingService parkingService){ //variable Springboot will call
        this.parkingService = parkingService;
    }

    // Get the status of all parking spots
    @GetMapping("/spots")
    public List<ParkingSpot> getAllParkingSpots() {
        return parkingService.getAllParkingSpots();
    }

    // Get a specific parking spot's status by ID
    @GetMapping("/spot/{id}")
    public ParkingSpot getParkingSpotById(@PathVariable Long id) {
        return parkingService.getParkingSpotById(id);
    }

    // Update the status of a specific parking spot
    @PutMapping("/spot/{id}")
    public ParkingSpot updateParkingSpotStatus(@PathVariable Long id, @RequestBody ParkingSpot parkingSpot) {
        return parkingService.updateParkingSpotStatus(id, parkingSpot);
    }

    // Receive update from ESP8266 (e.g., mark spot as occupied or free)
    @PostMapping("/update/{id}")
    public ParkingSpot updateSpotFromESP(@PathVariable Long id, @RequestBody Boolean isOccupied) {
        return parkingService.updateSpotStatus(id, isOccupied);
    }
}


