package ru.isands.technique.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Smartphone_model")
public class SmartphoneEntityModel extends Model{

    @Column(nullable = false)
    private int memory;
    @Column(nullable = false)
    private int numberOfCameras;

    public SmartphoneEntityModel() {
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
    public String toString() {
        return "SmartphoneEntityModel{" +
                "memory=" + memory +
                ", numberOfCameras=" + numberOfCameras +
                ", serialNumber='" + serialNumber + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", availabilityOfGoods=" + availabilityOfGoods +
                '}';
    }
}
