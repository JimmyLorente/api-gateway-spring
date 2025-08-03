package com.Entradas.Entradas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.Entradas.Entradas.ParticipantesDTO")
@SpringBootApplication
@EnableDiscoveryClient
public class EntradasApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntradasApplication.class, args);
	}

}
