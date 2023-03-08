-- ATIVIDADE 01 --

CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;
CREATE TABLE tb_classes(
	id bigint auto_increment,
    nome varchar(255) not null,
    preco double,
    primary key (id)
);
CREATE TABLE tb_personagens(
	id bigint auto_increment,
    nome varchar(255) not null,
    genero varchar(255) not null,
    ataque int,
    defesa int,
    primary key (id)
);

INSERT INTO tb_classes (nome, preco) values("Corrida", 150.00);
INSERT INTO tb_classes (nome, preco) values("Futebol", 350.00);
INSERT INTO tb_classes (nome, preco) values("Luta", 180.85);
INSERT INTO tb_classes (nome, preco) values("Ação", 100.00);
INSERT INTO tb_classes (nome, preco) values("Sudoku", 10.20);

INSERT INTO tb_personagens (nome, genero, ataque, defesa) values("Julia", "feminino", 1000,2000);
INSERT INTO tb_personagens (nome, genero, ataque, defesa) values("Juliana", "feminino", 800,200);
INSERT INTO tb_personagens (nome, genero, ataque, defesa) values("Mariana", "feminino", 4500,7000);
INSERT INTO tb_personagens (nome, genero, ataque, defesa) values("Fernanda", "feminino", 3000,6000);
INSERT INTO tb_personagens (nome, genero, ataque, defesa) values("Francisco", "masculino", 1000,500);
INSERT INTO tb_personagens (nome, genero, ataque, defesa) values("Fernando", "masculino", 1080,4000);
INSERT INTO tb_personagens (nome, genero, ataque, defesa) values("Caio", "masculino", 1085,3000);

SELECT * FROM tb_classes;
SELECT * FROM tb_personagens;

ALTER TABLE tb_personagens ADD categoria_id bigint; 
ALTER TABLE tb_personagens ADD CONSTRAINT fk_games 
FOREIGN KEY(categoria_id) REFERENCES tb_classes(id);

INSERT INTO tb_personagens (nome, genero, ataque, defesa, categoria_id) values("Lucas", "masculino", 15085,3000,2);
INSERT INTO tb_personagens (nome, genero, ataque, defesa, categoria_id) values("Francisco", "masculino", 1000,500,3);
INSERT INTO tb_personagens (nome, genero, ataque, defesa, categoria_id) values("Fernando", "masculino", 1080,4000,1);
INSERT INTO tb_personagens (nome, genero, ataque, defesa, categoria_id) values("Caio", "masculino", 1085,3000,4);

ALTER TABLE tb_classes drop foreign key fk_games_classes;
ALTER TABLE tb_classes DROP COLUMN categoria_id;

SELECT * FROM tb_personagens ORDER BY nome ASC;
SELECT * FROM tb_personagens WHERE ataque> 2000;
SELECT * FROM tb_personagens WHERE defesa> 1000 AND defesa<2000;
SELECT * FROM tb_personagens WHERE nome LIKE "%C%" ORDER BY nome DESC;
SELECT * FROM tb_personagens
INNER JOIN tb_classes ON tb_classes.id = tb_personagens.categoria_id;
SELECT * FROM tb_personagens
INNER JOIN tb_classes ON tb_classes.id = tb_personagens.categoria_id WHERE categoria_id = 2;

INSERT INTO tb_personagens (nome, genero, ataque, defesa, categoria_id) values("Yugo", "masculino", 995,100,4);
INSERT INTO tb_personagens (nome, genero, ataque, defesa, categoria_id) values("Yago", "masculino", 995,1500,2);

-- ATIVIDADE 02 --
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

-- ATIVIDADE 03 --

CREATE DATABASE db_farmacia_bem_estar;
USE db_farmacia_bem_estar;
CREATE TABLE tb_categoria(
	id bigint auto_increment,
    nome varchar(255) not null,
    quantidade double,
    primary key (id)
);
CREATE TABLE tb_produtos(
	id bigint auto_increment,
    nome varchar(255) not null,
    codigo int,
    produto varchar(255) not null,
    preco decimal,
    primary key (id)
);
ALTER TABLE tb_produtos ADD categoria_id bigint; 
ALTER TABLE tb_produtos ADD CONSTRAINT fk_produtos
FOREIGN KEY(categoria_id) REFERENCES tb_categorias(id);

INSERT INTO tb_categoria (nome, quantidade) values("Desodorante", 3);
INSERT INTO tb_categoria (nome, quantidade) values("Shampoo", 2);
INSERT INTO tb_categoria (nome, quantidade) values("Aspirinas", 100);
INSERT INTO tb_categoria (nome, quantidade) values("Antiácido", 75);
INSERT INTO tb_categoria(nome, quantidade) values("Antidepressivos", 1575);


INSERT INTO tb_produtos (nome, codigo, produto, preco, categoria_id) values("Dove", 1, "perfumaria", 8.50, 1);
INSERT INTO tb_produtos (nome, codigo, produto, preco, categoria_id) values("Rexona", 2, "perfumaria", 10.50, 1);
INSERT INTO tb_produtos (nome, codigo, produto, preco, categoria_id) values("Seda", 1, "perfumaria", 8.50, 2);
INSERT INTO tb_produtos (nome, codigo, produto, preco, categoria_id) values("Monange", 2, "perfumaria", 10.50, 2);
INSERT INTO tb_produtos (nome, codigo, produto, preco, categoria_id) values("Dipirona", 1, "farmácia", 8.50, 3);
INSERT INTO tb_produtos (nome, codigo, produto, preco, categoria_id) values("Neosaldina", 2, "farmácia", 10.50, 3);
INSERT INTO tb_produtos (nome, codigo, produto, preco, categoria_id) values("Eno", 1, "farmácia", 8.50, 4);
INSERT INTO tb_produtos (nome, codigo, produto, preco, categoria_id) values("Xantinon", 2, "farmácia", 10.50, 4);
INSERT INTO tb_produtos (nome, codigo, produto, preco, categoria_id) values("Diazepam", 1, "farmácia", 8.50, 4);
INSERT INTO tb_produtos (nome, codigo, produto, preco, categoria_id) values("Rivotril",1, "farmácia", 8.50, 4);


-- Verificando as planilhas --
SELECT * FROM tb_produtos;
SELECT * FROM tb_categoria;
SELECT * FROM tb_produtos WHERE preco >50;
SELECT * FROM tb_pizza WHERE preco> 50 AND preco<60;
SELECT * FROM tb_pizza WHERE nome LIKE "%C%";

-- Juntandas as duas planilhas --
SELECT * FROM tb_produtos
INNER JOIN tb_categoria ON tb_categoria.id = tb_produtos.categoria_id;

-- Puxando só os produtos de Desodorante
SELECT * FROM tb_pizza
INNER JOIN tb_categoria ON tb_categoria.id = tb_pizza.categoria_id WHERE categoria_id =1;

