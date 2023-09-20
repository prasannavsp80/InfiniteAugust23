use infinite_august23;

drop table if exists login;

create table Login
(
   userName varchar(30) primary key,
   passCode varchar(200)
);

