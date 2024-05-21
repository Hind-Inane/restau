package com.gestion.restau.security.Services;

import com.gestion.restau.security.Entities.Role;
import com.gestion.restau.security.Entities.User;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {

    User CreateUser(String username, String password, String email,String ConfirmPassword);
    Role CreateRole(String newRole);
    void AddRoleToUser(String username, String newRole);
    void RemoveRoleFromUser(String username, String newRole);
    User loadUserByUsername(String username);
    User GetUserByUsername(String username);
}
