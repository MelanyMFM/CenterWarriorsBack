package com.centerWarriors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CenterWarriorsApplication {
	public static void main(String[] args) {
		SpringApplication.run(CenterWarriorsApplication.class, args);
	}

	// Configuración de CORS (si es necesaria)
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/**")
						.allowedOrigins("http://localhost:5173") // URL de tu frontend
						.allowedMethods("GET", "POST", "PUT", "DELETE");
			}
		};
	}
}