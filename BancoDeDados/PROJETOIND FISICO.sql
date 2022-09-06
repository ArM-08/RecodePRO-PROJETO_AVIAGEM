Create database projetoind;
use projetoind;
CREATE TABLE Permissoes (
id_permissao INTEGER PRIMARY KEY not null,
tipoPerm VARCHAR(10) not null
);

CREATE TABLE usuario (
id_login VARCHAR(30) PRIMARY KEY not null,
nomeUsuario VARCHAR(30) not null, 
senha VARCHAR(10) not null,
email VARCHAR(30) not null,
id_permissao INTEGER not null,
FOREIGN KEY(id_permissao) REFERENCES Permissoes (id_permissao)
);

CREATE TABLE carrinho (
id_carrinho INTEGER PRIMARY KEY auto_increment,
dataCompra DATETIME not null,
valorTotal DECIMAL(10),
id_login VARCHAR(30) not null,
FOREIGN KEY(id_login) REFERENCES usuario (id_login)
);

CREATE TABLE Destinos (
id_destino INTEGER PRIMARY KEY not null auto_increment,
nome VARCHAR(20) not null,
valor DECIMAL(10) not null
);

CREATE TABLE itensDestinos (
valorDestinos DECIMAL(10) not null,
qtdDestino INTEGER not null,
id_destino INTEGER,
id_carrinho INTEGER,
FOREIGN KEY(id_destino) REFERENCES Destinos (id_destino),
FOREIGN KEY(id_carrinho) REFERENCES carrinho (id_carrinho)
);

