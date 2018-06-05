package com.dxj.eurakeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
/**
 * 表明是EurekaServer服务注册中心
 * 启动在8761
 */
@EnableEurekaServer
public class EurakeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakeServerApplication.class, args);
    }
}
