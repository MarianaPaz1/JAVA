CREATE DATABASE db_rh;
USE	db_rh;
CREATE TABLE tb_colaboradores(
	ID bigint auto_increment,
    nome varchar(100) not null,
    sobrenome varchar(100) not null,
    idade int,
    ativo boolean, 
    salario int,
    PRIMARY KEY (id)
);

INSERT INTO tb_colaboradores(nome, sobrenome, idade, ativo)
values ("Mariana", "Paz", 26,true);
INSERT INTO tb_colaboradores(nome, sobrenome, idade, ativo)
values ("Lucas", "Paz", 26,true);
INSERT INTO tb_colaboradores(nome, sobrenome, idade, ativo)
values ("Vania", "Paz", 26,true);
INSERT INTO tb_colaboradores(nome, sobrenome, idade, ativo)
values ("Gabriel", "Paz", 26,true);
INSERT INTO tb_colaboradores(nome, sobrenome, idade, ativo)
values ("Caroline", "Paz", 26,true);

SELECT * FROM tb_colaboradores;

UPDATE tb_colaboradores SET salario = 2000 WHERE id = 1;
UPDATE tb_colaboradores SET salario = 2010 WHERE id = 5;
UPDATE tb_colaboradores SET salario = 2015 WHERE id = 2;
UPDATE tb_colaboradores SET salario = 2020 WHERE id = 3;
UPDATE tb_colaboradores SET salario = 0200 WHERE id = 4;

SELECT * FROM tb_colaboradores WHERE salario>2000;
SELECT * FROM tb_colaboradores WHERE salario<2000;

UPDATE tb_colaboradores SET salario = 0020 WHERE id = 3;