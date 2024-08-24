package ru.isands.technique.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Fridge_model")
public class FridgeEntityModel extends Model{

    @Column(name = "NUMBER_OF_DOORS")
    private int numberOfDoors;
    @Column(name = "COMPRESSOR_TYPE")
    private String compressorType;

    public FridgeEntityModel() {
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
        return "FridgeEntityModel{" +
                "numberOfDoors=" + numberOfDoors +
                ", compressorType='" + compressorType + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", availabilityOfGoods=" + availabilityOfGoods +
                '}';
    }
}
