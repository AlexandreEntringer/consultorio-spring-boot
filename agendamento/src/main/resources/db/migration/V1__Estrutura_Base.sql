CREATE TABLE `especialidade` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  `nome_especialidade` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `medico` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `carga_horaria` int NOT NULL,
  `cpf` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `id_especialidade` bigint NOT NULL,
  `nome` varchar(255) NOT NULL,
  `numero_celular` varchar(255) NOT NULL,
  `registro` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKs0ua5sgfbylmja6l2lfylk8au` (`id_especialidade`),
  CONSTRAINT `FKs0ua5sgfbylmja6l2lfylk8au` FOREIGN KEY (`id_especialidade`) REFERENCES `especialidade` (`id`)
);

CREATE TABLE `paciente` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `cpf` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `numero_celular` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `agendamento` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `data_agendamento` datetime(6) NOT NULL,
  `id_medico` bigint NOT NULL,
  `id_paciente` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKkr47c113ppxrp8t9djh3jlqgl` (`id_medico`),
  KEY `FK5vinxou5wickpidh88urn7f17` (`id_paciente`),
  CONSTRAINT `FK5vinxou5wickpidh88urn7f17` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id`),
  CONSTRAINT `FKkr47c113ppxrp8t9djh3jlqgl` FOREIGN KEY (`id_medico`) REFERENCES `medico` (`id`)
);
