package ru.isands.technique.model;
import java.math.BigDecimal;
import java.util.Objects;

public class smartphone extends HouseholdAppliances{

    private int memory;
    private int numberOfCameras;

    public smartphone() {
    }

    public smartphone(Long id, String nameOfTheProduct, String serialNumber, String color, String size, BigDecimal price, boolean availabilityOfGoods, int memory, int numberOfCameras) {
        super(id, nameOfTheProduct, serialNumber, color, size, price, availabilityOfGoods);
        this.memory = memory;
        this.numberOfCameras = numberOfCameras;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getNumberOfCameras() {
        return numberOfCameras;
    }

    public void setNumberOfCameras(int numberOfCameras) {
        this.numberOfCameras = numberOfCameras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        smartphone that = (smartphone) o;
        return memory == that.memory && numberOfCameras == that.numberOfCameras;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), memory, numberOfCameras);
    }

    @Override
    public String toString() {
        return "smartphone{" +
                "memory=" + memory +
                ", numberOfCameras=" + numberOfCameras +
                ", id=" + id +
                ", nameOfTheProduct='" + nameOfTheProduct + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", availabilityOfGoods=" + availabilityOfGoods +
                '}';
    }
}
