package org.yakov;

import jakarta.annotation.PostConstruct;
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

    @PostConstruct
    public void startMethod() {
        IdProvider idProvider = () -> {
            int seed = (int) (System.currentTimeMillis() & 0xFFFF);
            final int a = 1103515245;
            final int c = 12345;
            final int m = Integer.MAX_VALUE;

            seed = (a * seed + c) & m;
            return String.valueOf(seed);
        };

        CommonUser user = new CommonUser(idProvider);
        System.out.println("Generated User ID: " + user.getId());
    }
}
