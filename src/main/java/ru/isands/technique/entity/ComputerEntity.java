package ru.isands.technique.entity;

import javax.persistence.*;

@Entity
@Table(name = "COMPUTER")
public class ComputerEntity extends HouseholdAppliancesEntity{

    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "TYPE_CPU")
    private String typeCPU;

    public ComputerEntity() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTypeCPU() {
        return typeCPU;
    }

    public void setTypeCPU(String typeCPU) {
        this.typeCPU = typeCPU;
    }

    @Override
    public String toString() {
        return "ComputerEntity{" +
                "category='" + category + '\'' +
                ", typeCPU='" + typeCPU + '\'' +
                '}';
    }
}
