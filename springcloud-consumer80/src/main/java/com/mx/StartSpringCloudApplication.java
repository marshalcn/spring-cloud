package com.mx;

import com.config.MyslefRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUDSERVICE-DEPT",configuration = MyslefRule.class)
public class StartSpringCloudApplication
{
    public static void main( String[] args ){
        SpringApplication.run(StartSpringCloudApplication.class,args) ;
    }
}
