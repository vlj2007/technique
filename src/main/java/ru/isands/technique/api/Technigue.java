package ru.isands.technique.api;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.isands.technique.entity.HouseholdAppliancesEntity;

public interface Technigue extends JpaRepository<HouseholdAppliancesEntity, Long> {
}
