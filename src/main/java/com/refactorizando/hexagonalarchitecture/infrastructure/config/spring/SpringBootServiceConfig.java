package com.refactorizando.hexagonalarchitecture.infrastructure.config.spring;


import com.refactorizando.hexagonalarchitecture.application.repository.UserRepository;
import com.refactorizando.hexagonalarchitecture.application.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootServiceConfig {

    @Bean
    public UserService userService(UserRepository userRepository) {
        return new UserService(userRepository);
    }
}