-- auto-generated definition
create table user
(
    id   int          not null
        primary key,
    age  int          null,
    name varchar(255) null,
    time DATETIME null
)
    engine = MyISAM;

