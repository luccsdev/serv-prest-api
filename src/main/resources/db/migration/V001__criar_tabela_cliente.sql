CREATE TABLE cliente (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	cpf VARCHAR(30),
	data_Cadastro datetime
) ENGINE=InnoDB DEFAULT CHARSET=utf8;