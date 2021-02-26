create table MOBLAB3_NOTE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    name varchar(255),
    description varchar(255),
    priority varchar(255),
    date timestamp,
    attachment longvarbinary,
    user_name varchar(36) not null,
    --
    primary key (ID),
    foreign key (user_name) references MOBLAB3_USER (name)
);