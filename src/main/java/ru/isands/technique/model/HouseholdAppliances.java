package ru.isands.technique.model;

import java.math.BigDecimal;
import java.util.Objects;

public class HouseholdAppliances {

    protected Long id;
    protected String nameOfTheProduct;
    protected String serialNumber;
    protected String color;
    protected String size;
    protected BigDecimal price;
    protected boolean availabilityOfGoods;


    public HouseholdAppliances() {
    }

    public HouseholdAppliances(Long id, String nameOfTheProduct, String serialNumber, String color, String size, BigDecimal price, boolean availabilityOfGoods) {
        this.id = id;
        this.nameOfTheProduct = nameOfTheProduct;
        this.serialNumber = serialNumber;
        this.color = color;
        this.size = size;
        this.price = price;
        this.availabilityOfGoods = availabilityOfGoods;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOfTheProduct() {
        return nameOfTheProduct;
    }

    public void setNameOfTheProduct(String nameOfTheProduct) {
        this.nameOfTheProduct = nameOfTheProduct;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isAvailabilityOfGoods() {
        return availabilityOfGoods;
    }

    public void setAvailabilityOfGoods(boolean availabilityOfGoods) {
        this.availabilityOfGoods = availabilityOfGoods;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseholdAppliances that = (HouseholdAppliances) o;
        return availabilityOfGoods == that.availabilityOfGoods && Objects.equals(id, that.id) && Objects.equals(nameOfTheProduct, that.nameOfTheProduct) && Objects.equals(serialNumber, that.serialNumber) && Objects.equals(color, that.color) && Objects.equals(size, that.size) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameOfTheProduct, serialNumber, color, size, price, availabilityOfGoods);
    }

    @Override
    public String toString() {
        return "HouseholdAppliances{" +
                "id=" + id +
                ", nameOfTheProduct='" + nameOfTheProduct + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", availabilityOfGoods=" + availabilityOfGoods +
                '}';
    }

}
