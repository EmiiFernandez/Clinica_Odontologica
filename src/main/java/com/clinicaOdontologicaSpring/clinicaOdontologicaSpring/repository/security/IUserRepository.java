package com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.repository.security;

import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.entity.login.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transactional
public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
