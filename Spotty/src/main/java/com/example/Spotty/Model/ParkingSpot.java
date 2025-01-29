package com.example.Spotty.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ParkingSpot {

    @Id
    private Long parkingSpotId;
    private String spotName;
    private boolean isOccupied;

    // Default constructor
    public ParkingSpot() {}

    // Parameterized constructor
    public ParkingSpot(Long parkingSpotId, String spotName, boolean isOccupied) {
        this.parkingSpotId = parkingSpotId;
        this.spotName = spotName;
        this.isOccupied = isOccupied;
    }

    // Getters and setters
    public Long getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(Long id) {
        this.parkingSpotId = id;
    }

    public String getSpotName() {
        return spotName;
    }

    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }
}


