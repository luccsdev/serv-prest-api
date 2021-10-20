package com.example.vendasjv.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vendasjv.model.inity.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{

}
