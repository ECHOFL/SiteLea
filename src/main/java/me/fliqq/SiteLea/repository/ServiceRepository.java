package me.fliqq.SiteLea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.fliqq.SiteLea.model.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
    

}
