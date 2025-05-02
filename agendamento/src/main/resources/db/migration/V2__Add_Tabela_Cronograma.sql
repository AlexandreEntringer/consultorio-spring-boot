CREATE TABLE cronograma (
	id BIGINT NOT NULL AUTO_INCREMENT,
	id_medico BIGINT NOT NULL,
	dia_semana varchar(25) NOT NULL,
	hora_inicio TIME NOT NULL,
	hora_fim TIME NOT NULL,
	hora_inicio_almoco TIME NOT NULL,
	hora_fim_almoco TIME NOT NULL,
	duracao TIME NULL,
	quant_vagas INTEGER NULL,
	situacao varchar(1) NOT NULL,
	CONSTRAINT cronograma_pk PRIMARY KEY (id),
	CONSTRAINT cronograma_medico_FK FOREIGN KEY (id_medico) REFERENCES agendamento.medico(id) ON DELETE RESTRICT ON UPDATE RESTRICT
)