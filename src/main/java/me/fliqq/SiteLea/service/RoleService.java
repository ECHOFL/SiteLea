package me.fliqq.SiteLea.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import me.fliqq.SiteLea.model.Role;
import me.fliqq.SiteLea.repository.RoleRepository;

@Service
public class RoleService {
    private final RoleRepository roleRepository;
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }
    public Optional<Role> getRoleByName(String name) {
        return roleRepository.findByName(name);
    }
}
