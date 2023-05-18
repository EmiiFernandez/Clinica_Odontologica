package com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.dto.login;

import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.entity.login.enums.ERole;
import lombok.Getter;

@Getter
public class RoleDTO {
    private Long id;
    private ERole role;

    public RoleDTO() {
    }

    public void setRole(ERole role) {
        this.role = role;
    }
}