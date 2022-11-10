create table agenda(
	id serial PRIMARY key,
	descricao varchar(255),
	data_hora timestamp,
	data_criacao timestamp,
	paciente_id integer,
	CONSTRAINT fk_agenda_paciente FOREIGN KEY (paciente_id) references paciente(id)
);
