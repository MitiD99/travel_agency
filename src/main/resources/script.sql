drop database web_trevel;

create database web_trevel;

use web_travel;

create table if not exists user(
   user_name varchar(25) not null primary key,
    user_last_name varchar(25) not null,
    user_email varchar(30) not null,
    user_phone_number int(15) not null);

create table if not exists tour(
    TOUR_ID int primary key auto_increment,
    TOUR_COUNTRY varchar(25) not null,
    TOUR_TOWN varchar(25) not null,
    TOUR_DATE_START date not null,
    TOUR_DATE_END date not null,
    TOUR_PRICE double not null);

create table if not exists role(
    ROLE varchar(10) not null);

create table if not exists user_choice(
    ID int not null);

create table if not exists choice(
    ID
)


