package org.yakov;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.yakov.model.CommonUser;
import org.yakov.util.IdProvider;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            IdProvider idProvider = () -> {
                int id = (int) (Math.random() * Integer.MAX_VALUE);
                return String.valueOf(id);
            };

            CommonUser user = new CommonUser(idProvider);
            System.out.println("Generated User ID: " + user.getId());
        };
    }
}