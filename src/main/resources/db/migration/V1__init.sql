create table products
(
    id bigserial primary key,
    title       varchar(255),
    cost        numeric(8, 2) not null
);

insert into products (title, cost)
values ('Молоко', 65.00),
       ('Овсянка', 50.00),
       ('Шоколад', 50.00),
       ('Бананы', 73.00),
       ('Картошка', 35.00),
       ('Курица', 310.00);
