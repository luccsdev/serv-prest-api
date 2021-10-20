package com.example.vendasjv.rest.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ServicoPrestadoDTO {

	@NotEmpty(message = "{campo.descricao.obrigadorio}")
	private String descricao;
	
	@NotEmpty(message = "{campo.preco.obrigadorio}")
	private String preco;
	
	@NotEmpty(message = "{campo.data.obrigadorio}")
	private String data;
	
	@NotNull(message = "{campo.cliente.obrigadorio}")
	private Integer idCliente;
}
