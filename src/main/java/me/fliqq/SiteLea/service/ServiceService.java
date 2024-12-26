package me.fliqq.SiteLea.service;

import java.util.List;
import java.util.Optional;

import me.fliqq.SiteLea.model.Service;
import me.fliqq.SiteLea.repository.ServiceRepository;

@org.springframework.stereotype.Service
public class ServiceService {
    private final ServiceRepository serviceRepository;
    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }
    public Service createService(Service service) {
        return serviceRepository.save(service);
    }
    
    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }
    public Optional<Service> getServiceById(Long id) {
        return serviceRepository.findById(id);
    }
    public Service updateService(Service service) {
        return serviceRepository.save(service);
    }
    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }
}
