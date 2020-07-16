package com.zcy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 该注解声明服务注册中心
 * */
@EnableEurekaServer
@SpringBootApplication
/**
 * 开启Hystrix断路器（ribbon中使用断路器）
 * */
//@EnableHystrix
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
        System.out.println("服务注册中心启动了");
    }

}
