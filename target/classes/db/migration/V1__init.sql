create table tails
(
    id                  bigserial primary key,

    owner               varchar(100) not null,
    tail_length         varchar(100),
    tail_color          varchar(16),

    created_at          timestamp default current_timestamp,
    updated_at          timestamp default current_timestamp
);

insert into tails (owner,tail_length,tail_color) values ('me','12','red');