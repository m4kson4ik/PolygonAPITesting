package org.example.models.House;

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
    private List<ParkingPlaces> parkingPlaces;
    private List<UserPojo> lodgers;

    public HousePojo(int id, int floorCount, int price, List<ParkingPlaces> parkingPlaces, List<UserPojo> lodgers) {
        this.id = id;
        this.floorCount = floorCount;
        this.price = price;
        this.parkingPlaces = parkingPlaces;
        this.lodgers = lodgers;
    }
}
