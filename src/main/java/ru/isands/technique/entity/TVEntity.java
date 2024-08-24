package ru.isands.technique.entity;

import javax.persistence.*;

@Entity
@Table(name = "TV")
public class TVEntity extends HouseholdAppliancesEntity{

    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "TECHNOLOGY")
    private String technology;

    public TVEntity() {
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
        return "TVEntity{" +
                "category='" + category + '\'' +
                ", technology='" + technology + '\'' +
                '}';
    }
}
