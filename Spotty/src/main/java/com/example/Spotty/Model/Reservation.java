package com.example.Spotty.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reservationId;
    @OneToOne(mappedBy = "parkingSpotId")
    private ParkingSpot parkingSpot;
    private Date startDate;
    private Date endDate;


}
