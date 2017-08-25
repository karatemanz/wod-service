package com.docker.wod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class App {
    public static void main(final String[] args) {
        SpringApplication.run(App.class, args);
    }
}