package ru.isands.technique.entity;

import javax.persistence.*;

@Entity
@Table(name = "FRIDGE")
public class FridgeEntity extends HouseholdAppliancesEntity{

    @Column(name = "NUMBER_OF_DOORS")
    private int numberOfDoors;
    @Column(name = "COMPRESSOR_TYPE")
    private String compressorType;


    public FridgeEntity() {
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getCompressorType() {
        return compressorType;
    }

    public void setCompressorType(String compressorType) {
        this.compressorType = compressorType;
    }

    @Override
    public String toString() {
        return "FridgeEntity{" +
                "numberOfDoors=" + numberOfDoors +
                ", compressorType='" + compressorType + '\'' +
                '}';
    }
}
