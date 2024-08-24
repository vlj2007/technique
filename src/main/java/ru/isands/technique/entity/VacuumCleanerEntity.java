package ru.isands.technique.entity;

import javax.persistence.*;

@Entity
@Table(name = "VACUUM_CLEANER")
public class VacuumCleanerEntity extends HouseholdAppliancesEntity{

    @Column(name = "DUST_COLLECTOR_CAPACITY")
    private int dustCollectorCapacity;
    @Column(name = "NUMBER_OF_MODES")
    private int numberOfModes;

    public VacuumCleanerEntity() {
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
        return "VacuumCleanerEntity{" +
                "numberOfModes=" + numberOfModes +
                ", dustCollectorCapacity=" + dustCollectorCapacity +
                '}';
    }
}
