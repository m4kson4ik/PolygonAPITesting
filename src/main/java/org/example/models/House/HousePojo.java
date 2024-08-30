package org.example.models.House;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.models.UserPojo;


import java.util.List;

@Builder
@Data
@AllArgsConstructor
public class HousePojo {
    public int id;
    private int floorCount;
    private double price;
    @JsonSerialize
    private List<ParkingPlaces> parkingPlaces;
    @JsonSerialize
    private List<UserPojo> lodgers;

    public HousePojo(int id, int floorCount, int price, List<ParkingPlaces> parkingPlaces, List<UserPojo> lodgers) {
        this.id = id;
        this.floorCount = floorCount;
        this.price = price;
        this.parkingPlaces = parkingPlaces;
        this.lodgers = lodgers;
    }
}
