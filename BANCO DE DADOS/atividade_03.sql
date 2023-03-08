CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;
-- criando as tabelas --
CREATE TABLE tb_categoria(
	id bigint auto_increment,
    nome varchar(255) not null,
    tipo varchar(100) not null,
    primary key (id)
);
CREATE TABLE tb_pizza(
	id bigint auto_increment,
    nome varchar(255) not null,
	preco int,
    tamanho int,
    borda varchar(255) not null,
    primary key (id)
);
-- criando a chave secundária --
ALTER TABLE tb_pizza ADD categoria_id bigint; 
ALTER TABLE tb_pizza ADD CONSTRAINT fk_pizza 
FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id);

-- Inserindo os tipos de pizza--
INSERT INTO tb_categoria (nome, tipo) values("Salgada", "Vegana");
INSERT INTO tb_categoria (nome, tipo) values("Salgada", "Tradicional");
INSERT INTO tb_categoria (nome, tipo) values("Doce", "Sobremesas");
INSERT INTO tb_categoria (nome, tipo) values("50/50", "Agridoce");
INSERT INTO tb_categoria (nome, tipo) values("Doce", "Diet");

-- Inserindo as pizzas--
INSERT INTO tb_pizza (nome, preco, tamanho, borda, categoria_id) values("Portuguesa", 59 , 8, "recheada", 2);
INSERT INTO tb_pizza (nome, preco, tamanho, borda, categoria_id) values("Carne Seca",59,8, "recheada", 2);
INSERT INTO tb_pizza (nome, preco, tamanho, borda, categoria_id) values("Calabresa",59,8, "recheada", 2);
INSERT INTO tb_pizza (nome, preco, tamanho, borda, categoria_id) values("Mussarela",59,8, "recheada", 2);
INSERT INTO tb_pizza (nome, preco, tamanho, borda, categoria_id) values("Brócolis",68,8, "recheada", 1);
INSERT INTO tb_pizza (nome, preco, tamanho, borda, categoria_id) values("Morango",78,8, "recheada", 3);
INSERT INTO tb_pizza (nome, preco, tamanho, borda, categoria_id) values("Barbecue",108,8, "recheada", 4);
INSERT INTO tb_pizza (nome, preco, tamanho, borda, categoria_id) values("Coco queimado",34,8, "sem recheio", 5);

-- Verificando as planilhas --
SELECT * FROM tb_pizza;
SELECT * FROM tb_categoria;
SELECT * FROM tb_pizza WHERE preco> 45;
SELECT * FROM tb_pizza WHERE preco> 50 AND preco<100;
SELECT * FROM tb_pizza WHERE nome LIKE "%M%" ORDER BY nome ASC;

-- Juntandas as duas planilhas --
SELECT * FROM tb_pizza
INNER JOIN tb_categoria ON tb_categoria.id = tb_pizza.categoria_id;

-- Puxando só as pizzas doces --
SELECT * FROM tb_pizza
INNER JOIN tb_categoria ON tb_categoria.id = tb_pizza.categoria_id WHERE categoria_id =3;
