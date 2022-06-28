create table products(
id bigserial primary key,
title varchar(255),
cost numeric(8, 2) not null
);

insert into products (title, cost) values
('Молоко', 65.00),
('Хлеб', 50.00),
('Шоколад', 150.00),
('Яйцо', 99.00),
('Апельсин', 75.00),
('Бананы', 100.00);