package com.org.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        String contextPath = request.getContextPath();
   
        if (roles.contains("ROLE_Inventario")) {
            response.sendRedirect(contextPath + "/Inventario/Home");
        } else if (roles.contains("ROLE_Ventas")) {
            response.sendRedirect(contextPath +"/Ventas/Home");
        } else {
            response.sendRedirect("/accessDenied");
        }
    }
}