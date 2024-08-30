
package org.example.models.Car;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class CarPojo {
    @SerializedName("engineType")
    private String engineType;
    private Long id;
    private String mark;
    private String model;
    private Double price;

    public CarPojo(String engineType, Long id, String mark, String model, Double price) {
        this.engineType = engineType;
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.price = price;
    }

    public Long getId() {
        return id;
    }
    public Double getPrice() {
        return price;
    }
}
