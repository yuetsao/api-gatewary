package com.yuetsao.apigatewary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ApiGatewaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewaryApplication.class, args);
    }

}

