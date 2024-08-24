package ru.isands.technique.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Vacuum_model")
public class VacuumCleanerEntityModel extends Model{

    private int dustCollectorCapacity;
    @Column(nullable = false)
    private int numberOfModes;

    public VacuumCleanerEntityModel() {
    }

    public int getDustCollectorCapacity() {
        return dustCollectorCapacity;
    }

    public void setDustCollectorCapacity(int dustCollectorCapacity) {
        this.dustCollectorCapacity = dustCollectorCapacity;
    }

    public int getNumberOfModes() {
        return numberOfModes;
    }

    public void setNumberOfModes(int numberOfModes) {
        this.numberOfModes = numberOfModes;
    }

    @Override
    public String toString() {
        return "VacuumCleanerEntityModel{" +
                "dustCollectorCapacity=" + dustCollectorCapacity +
                ", numberOfModes=" + numberOfModes +
                ", serialNumber='" + serialNumber + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", availabilityOfGoods=" + availabilityOfGoods +
                '}';
    }
}
