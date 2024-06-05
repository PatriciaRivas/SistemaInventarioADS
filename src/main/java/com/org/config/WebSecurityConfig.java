package com.org.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.org.service.CustomUserDetailsService;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	@Configuration
	@EnableWebSecurity
	@RequiredArgsConstructor
	public class SecurityConfig {
	    private final CustomUserDetailsService customDetailsService;
	    
	    @Bean
	    AuthenticationSuccessHandler customAuthenticationSuccessHandler() {
	        return new CustomAuthenticationSuccessHandler();
	    }

	    @Bean
	    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    	http
            .authorizeHttpRequests(authorizeRequests -> 
                authorizeRequests
	                .requestMatchers("/Inventario/**").hasRole("Inventario")
	                .requestMatchers("/Ventas/**").hasRole("Ventas")
	                .requestMatchers(HttpMethod.POST, "/fetch/**", "/transaction/**").hasAnyRole("Inventario", "Ventas")
	                .requestMatchers("/Login", "/").permitAll()
                    .anyRequest().authenticated()
            )
            .csrf(csrf -> csrf.disable())
            .formLogin(formLogin -> 
                formLogin
                    .loginPage("/Login")
                    .successHandler(customAuthenticationSuccessHandler())
                    .permitAll()
            )
            .logout(logout -> 
                logout
                    .permitAll()
            ).userDetailsService(customDetailsService);
	        return http.build();
	    }
	}
}