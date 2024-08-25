package ru.isands.technique.model;

import java.math.BigDecimal;

public class Fridge extends HouseholdAppliances{
    private int numberOfDoors;
    private String compressorType;

    public Fridge() {
    }

    public Fridge(Long id, String nameOfTheProduct, String serialNumber, String color, String size, BigDecimal price, boolean availabilityOfGoods, int numberOfDoors, String compressorType) {
        super(id, nameOfTheProduct, serialNumber, color, size, price, availabilityOfGoods);
        this.numberOfDoors = numberOfDoors;
        this.compressorType = compressorType;
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
        return "Fridge{" +
                "numberOfDoors=" + numberOfDoors +
                ", compressorType='" + compressorType + '\'' +
                '}';
    }
}
