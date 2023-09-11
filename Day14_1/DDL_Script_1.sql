drop database if exists practice23;
create database practice23;
use practice23;
create table department
(
	DeptNo int,
    Dname varchar(30),
    loc varchar(30),
    primary key(deptno)
);

create table employ
(
	Empno INT,
    DeptNo INT,
    EmpName varchar(30),
    Gender ENUM('MALE','FEMALE'),
    City varchar(30),
    primary key(Empno),
    foreign key(DeptNo) References department(Deptno)
);

Create Table Project
(
   ProjCode INT,
   EmpNo INT,
   Hours INT,
   ProjName varchar(30),
   foreign key(Empno) References Employ(Empno),
   primary key(Empno,ProjCode)
)
