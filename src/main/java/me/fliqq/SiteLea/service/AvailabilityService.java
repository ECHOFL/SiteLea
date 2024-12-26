package me.fliqq.SiteLea.service;

import java.util.List;

import org.springframework.stereotype.Service;

import me.fliqq.SiteLea.model.Availability;
import me.fliqq.SiteLea.repository.AvailabilityRepository;

@Service
public class AvailabilityService {
    private final AvailabilityRepository availabilityRepository;
    public AvailabilityService(AvailabilityRepository availabilityRepository) {
        this.availabilityRepository = availabilityRepository;
    }

    public Availability createAvailability(Availability availability) {
        return availabilityRepository.save(availability);
    }

    public List<Availability> getAllAvailabilities() {
        return availabilityRepository.findAll();
    }
    public void deleteAvailability(Long id) {
        availabilityRepository.deleteById(id);
    }
    
}
