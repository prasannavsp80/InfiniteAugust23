use practice23;

drop table if Exists empTest;
create table EmpTest
(
    Empno INT ,
    Name varchar(10),
    Sal INT
);

-- Change the field name size to 30 chars 

alter table EmpTest modify Name varchar(30);

desc EmpTest;

-- Add New Field gender to the particular Table 

alter table EmpTest Add Gender ENUM('MALE','FEMALE');

-- Add Primary Key on Empno Field 

alter table EmpTest add primary Key(empno);

desc EmpTest;
