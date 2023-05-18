package com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.service.security;

import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.dto.login.RoleDTO;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.entity.login.Role;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.entity.login.enums.ERole;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.exeptions.ResourceNotFoundException;

import java.util.List;

public interface IRoleService {
    RoleDTO buscarRole(Long id) throws ResourceNotFoundException;
    List<RoleDTO> buscarRoles();
    Role findByRoleName(ERole roleName);


}
