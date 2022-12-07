package com.example.demo.config;

import com.example.demo.repository.TacoUserRepository;
import com.example.demo.security.TacoUser;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Config {
    @Bean
    public ApplicationRunner dataLoader(
            TacoUserRepository repo, PasswordEncoder encoder) {
        return args -> {
            repo.save(
                    new TacoUser("habuma", encoder.encode("password"), "ROLE_ADMIN"));
            repo.save(
                    new TacoUser("tacochef", encoder.encode("password"), "ROLE_ADMIN"));
        };
    }
}
