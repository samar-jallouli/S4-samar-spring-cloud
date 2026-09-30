package com.samar.brand;

import com.samar.brand.entities.Brand;
import com.samar.brand.repos.BrandRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BrandMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrandMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(BrandRepository brandRepository) {
        return args -> {
            brandRepository.save(Brand.builder()
                    .brandName("Maybelline")
                    .brandCode("MB")
                    .build());
            brandRepository.save(Brand.builder()
                    .brandName("MAC Cosmetics")
                    .brandCode("MC")
                    .build());
        };
    }
}