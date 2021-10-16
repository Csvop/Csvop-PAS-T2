INSERT INTO produto (codigo,descricao,preco) VALUES (1, 'Mouse Dell', 83.0);
INSERT INTO produto (codigo,descricao,preco) VALUES (2, 'Teclado Dell', 160.0);
INSERT INTO produto (codigo,descricao,preco) VALUES (3, 'Monitor Dell', 2000.0);
INSERT INTO produto (codigo,descricao,preco) VALUES (4, 'Notebook Alienware', 8000.0);

INSERT INTO item_estoque (cod_produto,quantidade) VALUES (1,20);
INSERT INTO item_estoque (cod_produto,quantidade) VALUES (2,20);
INSERT INTO item_estoque (cod_produto,quantidade) VALUES (3,5);
INSERT INTO item_estoque (cod_produto,quantidade) VALUES (4,32);

INSERT INTO venda (codigo,data_venda,descricao,cod_prod,quantidade) VALUES (1,'20211015','Monitor Dell',1,2);
INSERT INTO venda (codigo,data_venda,descricao,cod_prod,quantidade) VALUES (2,'20211015','Monitor Dell',1,2);
INSERT INTO venda (codigo,data_venda,descricao,cod_prod,quantidade) VALUES (3,'20211015','Monitor Dell',1,2);
INSERT INTO venda (codigo,data_venda,descricao,cod_prod,quantidade) VALUES (4,'20211015','Monitor Dell',1,2);
INSERT INTO venda (codigo,data_venda,descricao,cod_prod,quantidade) VALUES (5,'20211015','Monitor Dell',1,2);
