package com.mx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class StartSpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartSpringCloudApplication.class,args) ;
    }
}
