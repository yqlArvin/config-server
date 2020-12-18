package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer  // 添加注解 @EnableConfigServer
@EnableDiscoveryClient
// @EnableEurekaClient 启用 eureka client 相关默认配置，在 Edgware 以后的版本该注解可以省略 只适用于Eureka作为注册中心，@EnableDiscoveryClient 可以是其他注册中心。
@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

}
