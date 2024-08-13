
package org.example.models;

import com.google.gson.annotations.SerializedName;
import lombok.Generated;

public class CreateUserRequest {

    @SerializedName("age")
    private Long mAge;
    @SerializedName("firstName")
    private String mFirstName;
    @SerializedName("id")
    private Long mId;
    @SerializedName("money")
    private double mMoney;
    @SerializedName("secondName")
    private String mSecondName;
    @SerializedName("sex")
    private String mSex;

    public Long getAge() {
        return mAge;
    }

    public void setAge(Long age) {
        mAge = age;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public double getMoney() {
        return mMoney;
    }

    public void setMoney(Long money) {
        mMoney = money;
    }

    public String getSecondName() {
        return mSecondName;
    }

    public void setSecondName(String secondName) {
        mSecondName = secondName;
    }

    public String getSex() {
        return mSex;
    }

    public void setSex(String sex) {
        mSex = sex;
    }

}
