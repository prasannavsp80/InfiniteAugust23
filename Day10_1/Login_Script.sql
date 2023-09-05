use infinite_august;

create table Login
(
  userName varchar(30) primary key,
  passCode varchar(30) NOT NULL
);

Insert into Login(UserName, passcode) values('Sagar','Mukkawar'),
('Jitendra','Sahoo'),('Aniruth','Mehta');