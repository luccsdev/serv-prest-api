package com.example.vendasjv;

import org.h2.command.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.vendasjv.model.inity.Cliente;
import com.example.vendasjv.model.repository.ClienteRepository;

@SpringBootApplication
public class VendasjvApplication {

		
	public static void main(String[] args) {
		SpringApplication.run(VendasjvApplication.class, args);
	}

}
