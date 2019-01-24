package com.tencent.lp.service_learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class ServiceLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceLearningApplication.class, args);
    }

}

