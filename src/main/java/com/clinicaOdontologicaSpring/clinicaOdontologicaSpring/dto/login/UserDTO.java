package com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.dto.login;

import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.entity.login.Role;
import lombok.Builder;
import lombok.Getter;

import java.util.Set;

@Builder
@Getter
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private Set<Role> roles;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
