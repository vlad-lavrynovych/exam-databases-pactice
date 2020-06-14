create table entity1
(
    id integer not null
            primary key,
    name varchar(255),
    price real not null,
    category_id integer
            references entity2
);

alter table entity1 owner to postgres;

create table entity2
(
    id integer not null
            primary key,
    category_name varchar(255),
    index varchar(255)
);

alter table entity2 owner to postgres;

