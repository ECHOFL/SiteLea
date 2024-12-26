package me.fliqq.SiteLea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.fliqq.SiteLea.model.Availability;

@Repository
public interface AvailabilityRepository extends JpaRepository<Availability, Long> {
    
}
