package com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.service.security.service;

import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.dto.login.UserDTO;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.entity.login.User;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.exeptions.ResourceNotFoundException;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.repository.security.IUserRepository;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.service.security.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    private IUserRepository userRepository;

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void guardarUser(UserDTO userDTO) {
        User user = mapper.convertValue(userDTO, User.class);
        userRepository.save(user);
    }

    @Override
    public UserDTO crearUser(UserDTO userDTO) {
        guardarUser(userDTO);
        return userDTO;
    }

    @Override
    public UserDTO buscarUserId(Long id) throws ResourceNotFoundException {
        User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Paciente no encontrado con id: " + id));
        UserDTO userDTO = mapper.convertValue(user, UserDTO.class);
        return userDTO;
    }


    @Override
    public UserDTO actualizarUser(UserDTO userDTO) {
        guardarUser(userDTO);
        return userDTO;
    }

    @Override
    public void eliminarUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }


    @Override
    public List<UserDTO> buscarUsers() {
        List<User> users = userRepository.findAll();
        List<UserDTO> usersDTO = new ArrayList<>();

        for (User user : users) {
            UserDTO userDTO = mapper.convertValue(user, UserDTO.class);
            usersDTO.add(userDTO);
        }

        return usersDTO;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
    }
}