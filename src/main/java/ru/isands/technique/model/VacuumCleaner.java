package ru.isands.technique.model;

import java.math.BigDecimal;

public class VacuumCleaner extends HouseholdAppliances {

    private int dustCollectorCapacity;

    private int numberOfModes;


    public VacuumCleaner() {
    }

    public VacuumCleaner(Long id, String nameOfTheProduct, String serialNumber, String color, String size, BigDecimal price, boolean availabilityOfGoods) {
        super(id, nameOfTheProduct, serialNumber, color, size, price, availabilityOfGoods);
    }

    public int getDustCollectorCapacity() {
        return dustCollectorCapacity;
    }

    public void setDustCollectorCapacity(int dustCollectorCapacity) {
        this.dustCollectorCapacity = dustCollectorCapacity;
    }

    public int getNumberOfModes() {
        return numberOfModes;
    }

    public void setNumberOfModes(int numberOfModes) {
        this.numberOfModes = numberOfModes;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "dustCollectorCapacity=" + dustCollectorCapacity +
                ", numberOfModes=" + numberOfModes +
                '}';
    }

}
