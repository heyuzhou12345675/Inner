package com.zcy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
/**
 * 声明自己是服务提供者
 * */
@EnableEurekaClient
/**
 * 向服务中心注册
 * */
@EnableDiscoveryClient
/**
 * 开启feign消费者
 * */
@EnableFeignClients
public class FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
		System.out.println("Feign消费者启动");
	}

}
