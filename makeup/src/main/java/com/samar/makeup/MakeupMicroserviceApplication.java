package com.samar.makeup;

import com.samar.makeup.entities.Makeup;
import com.samar.makeup.repos.MakeupRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MakeupMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MakeupMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(MakeupRepository makeupRepository) {
        return args -> {
            makeupRepository.save(Makeup.builder()
                    .makeupName("Velvet Matte Lipstick")
                    .makeupType("Lipstick")
                    .brandCode("MB")
                    .build());
        };
    }

    @Bean
    public WebClient webClient() {
        return WebClient.builder().build();
    }

}
