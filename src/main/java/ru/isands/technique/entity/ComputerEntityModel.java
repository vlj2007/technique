package ru.isands.technique.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Computer_model")
public class ComputerEntityModel extends Model{

    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "PROCESSOR_TYPE")
    private String processorType;

    public ComputerEntityModel() {
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
    public String toString() {
        return "ComputerEntityModel{" +
                "category='" + category + '\'' +
                ", processorType='" + processorType + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", availabilityOfGoods=" + availabilityOfGoods +
                '}';
    }
}
