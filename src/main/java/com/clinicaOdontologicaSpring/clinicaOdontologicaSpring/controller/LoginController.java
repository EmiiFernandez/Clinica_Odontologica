package com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.controller;
/*
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.entity.User;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.security.AuthenticationResponse;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.security.utils.JwtUtil;
import com.clinicaOdontologicaSpring.clinicaOdontologicaSpring.service.security.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/login")
public class LoginController {


    @Autowired
    private IUserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping()
    public ResponseEntity<?> authenticateUser(@RequestParam String username, @RequestParam String password) {

        Optional<User> user = userService.loadUserByUsername(username);

        if (!user.isPresent()) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }

        if (!passwordEncoder.matches(password, user.get().getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }

        String token = jwtUtil.generateToken(user.get());

        return ResponseEntity.ok(new AuthenticationResponse(token));
    }

    @GetMapping("")
    public ResponseEntity<User> getLoginDetails(@RequestParam String username) {

        Optional<User> user = userService.findByUsername(username);

        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
*/