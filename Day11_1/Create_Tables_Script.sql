drop database if exists infinite_august23;

create database infinite_august23;

use infinite_august23;

drop table if exists Employ;

Create Table Employ
(
   Empno INT primary key,
   Name varchar(30),
   Gender enum('MALE', 'FEMALE'),
   Dept varchar(30),
   Desig varchar(30),
   Basic numeric(9,2)
);
