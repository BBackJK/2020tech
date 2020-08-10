create table ACTOR
(
    CODE    varchar(10)  not null
        primary key,
    NAME    varchar(50)  null,
    ENGNAME varchar(100) null,
    BIRTH   varchar(20)  null,
    COUNTRY varchar(50)  null,
    DOMAIN  varchar(20)  null,
    PILMO   varchar(255) null
);

create table COMPANY
(
    CODE             varchar(10)   not null
        primary key,
    COMPANY_NAME     varchar(255)  null,
    ENG_COMPANY_NAME varchar(255)  null,
    CATEGORY         varchar(255)  null,
    CEO              varchar(255)  null,
    PHONE            varchar(255)  null,
    HOMEPAGE         varchar(255)  null,
    ADDR             varchar(255)  null,
    INTRO            varchar(2000) null,
    PILMO            varchar(2000) null
);

create table MOVIE
(
    CODE       varchar(10)   not null
        primary key,
    TITLE      varchar(255)  null,
    ENG_TITLE  varchar(255)  null,
    PUB_YEAR   varchar(10)   null,
    COUNTRY    varchar(100)  null,
    MOVIE_TYPE varchar(50)   null,
    GENRE      varchar(50)   null,
    OPEN_FLAG  varchar(20)   null,
    DIRECTOR   varchar(500)  null,
    PRODUCTION varchar(1000) null
);

create table SCREEN
(
    CODE         varchar(10)  not null
        primary key,
    SIDO         varchar(255) null,
    GUGUN        varchar(255) null,
    SCREEN_NAME  varchar(255) null,
    SCREEN_COUNT varchar(255) null,
    SEAT_COUNT   varchar(255) null,
    OPEN_TYPE    varchar(255) null,
    REG_TYPE     varchar(255) null,
    BIZ_NAME     varchar(255) null,
    OPEN_DATE    varchar(255) null,
    OPEN_STATUS  varchar(255) null
);

