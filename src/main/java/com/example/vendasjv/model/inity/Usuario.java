package com.example.vendasjv.model.inity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true, name= "login")
	@NotEmpty(message = "{campo.login.obrigadorio}")
	private String username;
	
	@Column(name = "senha")
	@NotEmpty(message = "{campo.senha.obrigadorio}")
	private String password;   
	
}
