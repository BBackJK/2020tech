create table ACTOR
(
    CODE     varchar(10) not null
        primary key,
    NAME     varchar(50),
    ENG_NAME varchar(100),
    BIRTH    varchar(20),
    COUNTRY  varchar(50),
    DOMAIN   varchar(20),
    PILMO    varchar(255)
);

create table COMPANY
(
    CODE             varchar(10) not null
        primary key,
    COMPANY_NAME     varchar(255),
    ENG_COMPANY_NAME varchar(255),
    CATEGORY         varchar(255),
    CEO              varchar(255),
    PHONE            varchar(255),
    HOMEPAGE         varchar(255),
    ADDR             varchar(255),
    INTRO            varchar(2000),
    PILMO            varchar(2000)
);

create table MOVIE
(
    CODE       varchar(10) not null
        primary key,
    TITLE      varchar(255),
    ENG_TITLE  varchar(255),
    PUB_YEAR   varchar(10),
    COUNTRY    varchar(100),
    MOVIE_TYPE varchar(50),
    GENRE      varchar(50),
    OPEN_FLAG  varchar(20),
    DIRECTOR   varchar(1000),
    PRODUCTION varchar(1000)
);

create table SCREEN
(
    CODE         varchar(10) not null
        primary key,
    SIDO         varchar(255),
    GUGUN        varchar(255),
    SCREEN_NAME  varchar(255),
    SCREEN_COUNT varchar(255),
    SEAT_COUNT   varchar(255),
    OPEN_TYPE    varchar(255),
    REG_TYPE     varchar(255),
    BIZ_NAME     varchar(255),
    OPEN_DATE    varchar(255),
    OPEN_STATUS  varchar(255)
);
