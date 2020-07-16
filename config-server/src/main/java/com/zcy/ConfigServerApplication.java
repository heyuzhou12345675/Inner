package com.zcy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
/**
 * 这个要加EnableDiscoveryClient不然启动config-client的时候会报找不到No instances found of config-server
 * @EnableDiscoveryClient配置中心作为一个服务客户端注册进去，为其他服务提供服务*/
//@EnableEurekaClient
@EnableDiscoveryClient
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
		System.out.println("config-server启动");
	}

}
