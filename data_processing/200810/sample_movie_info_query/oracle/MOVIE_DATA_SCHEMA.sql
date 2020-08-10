create table ACTOR
(
    CODE     VARCHAR2(10) not null
        primary key,
    NAME     VARCHAR2(100),
    ENG_NAME VARCHAR2(100),
    BIRTH    VARCHAR2(20),
    COUNTRY  VARCHAR2(50),
    DOMAIN   VARCHAR2(50),
    PILMO    VARCHAR2(255)
);

create table COMPANY
(
    CODE             VARCHAR2(10) not null
        primary key,
    COMPANY_NAME     VARCHAR2(255),
    ENG_COMPANY_NAME VARCHAR2(255),
    CATEGORY         VARCHAR2(255),
    CEO              VARCHAR2(255),
    PHONE            VARCHAR2(255),
    HOMEPAGE         VARCHAR2(255),
    ADDR             VARCHAR2(255),
    INTRO            VARCHAR2(2000),
    PILMO            VARCHAR2(4000)
);

create table MOVIE
(
    CODE       VARCHAR2(10) not null
        primary key,
    TITLE      VARCHAR2(255),
    ENG_TITLE  VARCHAR2(255),
    PUB_YEAR   VARCHAR2(10),
    COUNTRY    VARCHAR2(100),
    MOVIE_TYPE VARCHAR2(50),
    GENRE      VARCHAR2(50),
    OPEN_FLAG  VARCHAR2(20),
    DIRECTOR   VARCHAR2(1000),
    PRODUCTION VARCHAR2(1000)
);

create table SCREEN
(
    CODE         VARCHAR2(10) not null
        primary key,
    SIDO         VARCHAR2(255),
    GUGUN        VARCHAR2(255),
    SCREEN_NAME  VARCHAR2(255),
    SCREEN_COUNT VARCHAR2(255),
    SEAT_COUNT   VARCHAR2(255),
    OPEN_TYPE    VARCHAR2(255),
    REG_TYPE     VARCHAR2(255),
    BIZ_NAME     VARCHAR2(255),
    OPEN_DATE    VARCHAR2(255),
    OPEN_STATUS  VARCHAR2(255)
);

