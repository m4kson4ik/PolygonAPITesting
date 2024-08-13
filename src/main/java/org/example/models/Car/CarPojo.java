
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
    @SerializedName("id")
    public Long id;
    @SerializedName("mark")
    private String mark;
    @SerializedName("model")
    private String model;
    @SerializedName("price")
    public Double price;

    public CarPojo(String mEngineType, Long mId, String mMark, String mModel, Double mPrice) {
        this.engineType = mEngineType;
        this.id = mId;
        this.mark = mMark;
        this.model = mModel;
        this.price = mPrice;
    }
}
