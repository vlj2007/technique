package ru.isands.technique.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Map;

@Entity
@Table(name = "HOUSEHOLD_APPLIANCES")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class HouseholdAppliancesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nameOfTheProduct;

    private String serialNumber;

    private String color;

    private String size;

    private BigDecimal price;

    private boolean availabilityOfGoods;

    public HouseholdAppliancesEntity() {
    }

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "HOUSEHOLD_APPLIANCES_ID")
    private Map<Model, Integer> availableModels;

    @Override
    public String toString() {
        return "HouseholdAppliancesEntity{" +
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
