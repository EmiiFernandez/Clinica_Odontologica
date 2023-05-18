package com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.repository.security;

import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.entity.login.Role;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.entity.login.enums.ERole;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transactional
public interface IRoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(ERole roleName);
}
