package com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.service.security.service;

import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.dto.login.RoleDTO;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.entity.login.Role;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.entity.login.enums.ERole;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.exeptions.ResourceNotFoundException;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.repository.security.IRoleRepository;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.service.security.IRoleService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class RoleServiceImpl implements IRoleService {

    private IRoleRepository roleRepository;

    @Autowired
    ObjectMapper mapper;

    @Autowired
    public RoleServiceImpl(IRoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Override
    public RoleDTO buscarRole(Long id) throws ResourceNotFoundException {
        Role role = roleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Paciente no encontrado con id: " + id));
        RoleDTO roleDTO = mapper.convertValue(role, RoleDTO.class);
        return roleDTO;
    }

    @Override
    public List<RoleDTO> buscarRoles() {
        List<Role> roles = roleRepository.findAll();
        List<RoleDTO> roleDTOS = new ArrayList<>();

        for (Role role : roles) {
            RoleDTO roleDTO = mapper.convertValue(role, RoleDTO.class);
            roleDTOS.add(roleDTO);
        }
        return roleDTOS;
    }

    @Override
    public Role findByRoleName(ERole roleName) {
        Optional<Role> roleOptional = roleRepository.findByRoleName(roleName);
        return roleOptional.orElse(null);
    }
}
