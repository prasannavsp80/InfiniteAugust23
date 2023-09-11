use practice23;

delete from project;
delete from employ;
delete from Department;
Insert into Department(Deptno,Dname,Loc) 
values(101,'Dotnet','Hyderabad'),
(102,'Java','Bangalore'),
(103,'Sql','Chennai'),
(104,'Testing','Delhi');

delete from Employ;
Insert into Employ(Empno,Deptno,EmpName,City,Gender)
values(300,101,'Satya Prakash','Delhi','MALE'),
(301,102,'Subhra Prakash','Hyderabad','MALE'),
(302,103,'Shirisha','Hyderabad','FEMALE'),
(303,101,'Jitendra','Agra','MALE'),
(304,103,'Sonali','Pune','FEMALE'),
(305,102,'Unmesha','Agra','FEMALE');


delete from project;

insert into project(Projcode,Empno,Hours,ProjName) 
values(101,300,100,'ZC'),
	(102,300,90,'City Bank'),
    (101,303,190,'ZC');