package com.zhonghao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer_Config_6001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_Config_6001.class, args);
    }

}
