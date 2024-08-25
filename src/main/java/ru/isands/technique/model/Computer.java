package ru.isands.technique.model;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.Objects;

public class Computer extends HouseholdAppliances{

    private String category;
    private String processorType;


    public Computer(String category, String processorType) {
        this.category = category;
        this.processorType = processorType;
    }

    public Computer(Long id, String nameOfTheProduct, String serialNumber, String color, String size, BigDecimal price, boolean availabilityOfGoods, String category, String processorType) {
        super(id, nameOfTheProduct, serialNumber, color, size, price, availabilityOfGoods);
        this.category = category;
        this.processorType = processorType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Computer computer = (Computer) o;
        return Objects.equals(category, computer.category) && Objects.equals(processorType, computer.processorType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category, processorType);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "category='" + category + '\'' +
                ", processorType='" + processorType + '\'' +
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
