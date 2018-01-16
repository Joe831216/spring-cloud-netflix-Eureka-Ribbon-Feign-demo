package com.example.serviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// 向配置文件中指定的服務註冊中心(Eureka-Server)的網址註冊自己提供的服務
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServerProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerProducerApplication.class, args);
	}
}
