package com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.entity.login;

import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.dto.login.RoleDTO;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.entity.login.enums.ERole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Table(name = "roles")
public class Role {

    @Id
    @SequenceGenerator(name = "role_sequence", sequenceName = "role_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "role_sequence")
    @Column(name = "role_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;


    public Role() {
    }

    public Role(ERole name) {
        this.name = name;
    }
    public Role(RoleDTO roleDTO) {
        this.id = roleDTO.getId();
        this.name = roleDTO.getRole();
    }

    public void setName(ERole name) {
        this.name = name;
    }

}