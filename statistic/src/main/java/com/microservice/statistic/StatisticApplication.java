package com.microservice.statistic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories("com.microservice.statistic")
public class StatisticApplication {
    public static void main(String[] args) {
        SpringApplication.run(StatisticApplication.class, args);
    }
}
