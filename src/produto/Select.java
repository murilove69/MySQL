SELECT COUNT(*) AS total_produtos FROM Produtos;
SELECT AVG(preço) AS preco_medio FROM Produtos;
SELECT perecivel, AVG(preço) AS preco_medio FROM Produtos GROUP BY perecivel;
SELECT nome, AVG(preço) AS preco_medio FROM Produtos GROUP BY nome;
SELECT AVG(preço) AS preco_medio, SUM(estoque) AS total_estoque FROM Produtos;
SELECT nome, estoque FROM Produtos ORDER BY preço DESC LIMIT 1;
SELECT nome, preço FROM Produtos WHERE preço > (SELECT AVG(preço) FROM Produtos);
SELECT nacionalidade, COUNT(*) AS quantidade_produtos FROM Produtos GROUP BY nacionalidade;

