create table fruits
(
    id                  bigserial primary key,
    name               varchar(100) not null
);

insert into fruits (name)
values ('Яблоко'),
       ('Апельсин'),
       ('Банан'),
       ('Виноград');