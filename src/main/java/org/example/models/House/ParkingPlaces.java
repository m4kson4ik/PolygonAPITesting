package org.example.models.House;

import lombok.Data;

@Data
public class ParkingPlaces {
    private Integer id;
    private Boolean isWarm;
    private Boolean isCovered;
    private Integer placesCount;
}
