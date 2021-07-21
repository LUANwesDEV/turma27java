-- Atividade 1

create database db_rh;

use db_rh;

create table tb_funcionario(
	id bigint(5) auto_increment,
	nome varchar(20) not null,
    idade int,
    endereco varchar(50),
    cpf varchar(11),
    salario double(6,00),
    ativo boolean,
    primary key (id)
 );

select * from tb_funcionario;


INSERT INTO tb_funcionario (nome, idade,endereco,cpf,salario,ativo) VALUES ("Luan Sena", 19,"Estrada do Paraiso,58",12345678901,5000, true);
INSERT INTO tb_funcionario (nome, idade,endereco,cpf,salario,ativo) VALUES ("Joaquina ", 33,"Estrada do Paraiso,13",12345678901,4000, true);
INSERT INTO tb_funcionario (nome, idade,endereco,cpf,salario,ativo) VALUES ("Wesley", 40,"Estrada do Paraiso,45",12345678901,1500, true);
INSERT INTO tb_funcionario (nome, idade,endereco,cpf,salario,ativo) VALUES ("Maria", 25,"Estrada do Paraiso,47",12345678901,1900, true);
INSERT INTO tb_funcionario (nome, idade,endereco,cpf,salario,ativo) VALUES ("Marcelo", 31,"Estrada do Paraiso,20",12345678901,9000, true);

select * from tb_funcionario where salario < 2000;

select * from tb_funcionario where salario > 2000;