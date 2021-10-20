package com.example.vendasjv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.vendasjv.config.VendasPropertyConfig;

@SpringBootApplication
@EnableConfigurationProperties(VendasPropertyConfig.class)
public class VendasjvApplication {

		
	public static void main(String[] args) {
		SpringApplication.run(VendasjvApplication.class, args);
	}

}
