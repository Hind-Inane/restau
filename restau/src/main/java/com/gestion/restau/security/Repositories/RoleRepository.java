package com.gestion.restau.security.Repositories;

import com.gestion.restau.security.Entities.Role;
import com.gestion.restau.security.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    Role findByRole(String name);
}
