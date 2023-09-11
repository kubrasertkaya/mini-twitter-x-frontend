package com.workintech.twitter.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfiguration implements WebMvcConfigurer{
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/users") // Sunucu tarafındaki endpoint'i buraya ekleyin
                .allowedOrigins("http://localhost:3000") // İzin verilen kök URL
                .allowedMethods("GET", "POST", "PUT", "DELETE") // İzin verilen HTTP metotları
                .allowCredentials(true); // Tarayıcıda çerez ile kimlik doğrulama kullanılıyorsa true yapın
}}
