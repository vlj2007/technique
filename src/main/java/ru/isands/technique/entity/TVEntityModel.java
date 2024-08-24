package ru.isands.technique.entity;

import javax.persistence.*;

@Entity
@Table(name = "television_model")
public class TVEntityModel extends Model{

    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private String technology;

    public TVEntityModel() {
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
    public String toString() {
        return "TVEntityModel{" +
                "category='" + category + '\'' +
                ", technology='" + technology + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", availabilityOfGoods=" + availabilityOfGoods +
                '}';
    }
}
