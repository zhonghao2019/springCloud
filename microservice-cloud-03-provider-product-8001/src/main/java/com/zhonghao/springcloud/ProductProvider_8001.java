package com.zhonghao.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //将此服务注册到Eureka 服务注册中心
@MapperScan("com.zhonghao.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001.class, args);
    }

}
