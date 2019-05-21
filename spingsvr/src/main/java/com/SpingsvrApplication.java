package com;

import javafx.application.Application;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpingsvrApplication {



    public static void main(String[] args) {
            new SpringApplicationBuilder(SpingsvrApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

}
