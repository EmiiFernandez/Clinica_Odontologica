package com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.service.security;

import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.dto.login.UserDTO;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.entity.login.User;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.exeptions.ResourceNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface IUserService extends UserDetailsService {
    void guardarUser(UserDTO userDTO);
    UserDTO crearUser(UserDTO userDTO);
    UserDTO buscarUserId(Long id) throws ResourceNotFoundException;
    List<UserDTO> buscarUsers();
    UserDTO actualizarUser(UserDTO userDTO);
    void eliminarUser(Long id);

    Optional<User> findByUsername(String username);
}
