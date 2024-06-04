package com.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import com.org.inventario.dao.ROLES_DAO;
import com.org.inventario.dao.USUARIOS_DAO;
import com.org.inventario.entity.ROLES_ENTITY;
import com.org.inventario.entity.USUARIOS_ENTITY;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private USUARIOS_DAO userRepository;
    
    @Autowired
    private ROLES_DAO userRoleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        USUARIOS_ENTITY user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }else {
        	ROLES_ENTITY rol = userRoleRepository.findByIdRole(user.getRolId());
        	return User.withUsername(user.getUsername())
                .password(passwordEncoder().encode(user.getPassword()))
                .roles(rol.getName())
                .build();
        }        
    }
    
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}