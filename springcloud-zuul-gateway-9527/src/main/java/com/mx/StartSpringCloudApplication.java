package com.mx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class StartSpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartSpringCloudApplication.class,args) ;
    }
}
