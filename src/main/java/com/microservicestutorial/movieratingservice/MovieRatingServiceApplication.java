package com.microservicestutorial.movieratingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // not mandatory
public class MovieRatingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieRatingServiceApplication.class, args);
    }

}
