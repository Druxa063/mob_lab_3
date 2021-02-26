-- begin MOBLAB3_USER
create table MOBLAB3_USER (
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
    password varchar(255),
    --
    primary key (ID)
)^
-- end MOBLAB3_USER
-- begin MOBLAB3_NOTE
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
    user_name varchar(36),
    --
    primary key (ID)
)^
-- end MOBLAB3_NOTE
