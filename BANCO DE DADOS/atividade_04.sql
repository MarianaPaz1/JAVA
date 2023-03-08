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

