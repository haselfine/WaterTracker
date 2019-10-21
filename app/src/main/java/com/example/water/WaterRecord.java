package com.example.water;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class WaterRecord { //class which uses constituents to represent columns in the database table

    @PrimaryKey
    @NonNull
    private String day;

    private int glasses;

    public WaterRecord(@NonNull String day, int glasses){
        this.day = day;
        this.glasses = glasses;
    }

    @NonNull
    public String getDay() {
        return day;
    }

    public void setDay(@NonNull String day) {
        this.day = day;
    }

    public int getGlasses() {
        return glasses;
    }

    public void setGlasses(int glasses) {
        this.glasses = glasses;
    }

    @Override
    public String toString(){
        return "WaterRecord{" +
                "glasses=" + glasses +
                ", day=" + day + '}';
    }
}
