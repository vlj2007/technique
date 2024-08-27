package ru.isands.technique.api;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.isands.technique.entity.HouseholdAppliancesEntity;

public interface Technique extends JpaRepository<HouseholdAppliancesEntity, Long> {
}
