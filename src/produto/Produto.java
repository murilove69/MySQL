create table Produtos (
id_produto int 	primary key auto_increment,
nome varchar(50) NOT  NULL,
preço decimal (10,2) NOT NULL,
estoque int (20),
perecivel TINYINT(1) NOT NULL,
marca varchar (50),
nacionalidade varchar (20)
);
insert into Produtos values
(null, Arroz, 21.75, 250, 0, Raroz,Brasileir),
(null, Feijão, 12.90, 90, 0, Campineiro, Brasileiro),
(null, Salgadinho, 5.99, 50, 1, ElmaChips, Brasileiro),
(null, Açucar , 18.99, 130, 0, LosHermanos, Argentino),
(null, Bolacha, 2.99, 300, 1, Panco, Brasileiro);