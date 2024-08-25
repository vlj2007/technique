package ru.isands.technique.model;

import java.math.BigDecimal;
import java.util.Objects;

public class TV extends HouseholdAppliances{

    private String category;
    private String technology;


    public TV() {
    }

    public TV(Long id, String nameOfTheProduct, String serialNumber, String color, String size, BigDecimal price, boolean availabilityOfGoods, String category, String technology) {
        super(id, nameOfTheProduct, serialNumber, color, size, price, availabilityOfGoods);
        this.category = category;
        this.technology = technology;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TV tv = (TV) o;
        return Objects.equals(category, tv.category) && Objects.equals(technology, tv.technology);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category, technology);
    }
}
