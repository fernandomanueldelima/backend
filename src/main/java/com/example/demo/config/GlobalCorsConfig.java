package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@Configuration
public class GlobalCorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        // Permitir todos los headers
        corsConfiguration.setAllowedHeaders(Arrays.asList("*"));
        // Permitir todos los métodos HTTP
        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        // Permitir múltiples orígenes: localhost y producción
        corsConfiguration.setAllowedOrigins(Arrays.asList(
                "http://localhost:5173",
                "https://mi-dominio-produccion.com"
        ));
        // Permitir credenciales (cookies, Authorization headers)
        corsConfiguration.setAllowCredentials(true);

        // Si quisieras permitir subdominios con wildcard, Spring Boot < 2.4 no soporta '*'
        // directamente en setAllowedOrigins con allowCredentials=true.
        // Alternativa: podés implementar un CorsProcessor que valide los orígenes dinámicamente.

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // Aplicar a todos los endpoints
        source.registerCorsConfiguration("/**", corsConfiguration);

        return new CorsFilter(source);
    }
}
