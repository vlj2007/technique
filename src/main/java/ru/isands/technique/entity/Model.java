package ru.isands.technique.entity;

import javax.persistence.*;
import java.math.BigDecimal;
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nameOfTheProduct;
    @Column(nullable = false)
    protected String serialNumber;
    @Column(nullable = false)
    protected String color;
    @Column(nullable = false)
    protected String size;
    @Column(nullable = false)
    protected BigDecimal price;
    @Column(nullable = false)
    protected boolean availabilityOfGoods;

    public Model() {
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
    public String toString() {
        return "Model{" +
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
