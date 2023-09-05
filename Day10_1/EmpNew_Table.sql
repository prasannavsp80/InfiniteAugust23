use infinite_august;

Drop Table if exists EmpNew;

Create Table EmpNew
(
    EmpNewno int AUTO_INCREMENT,
    Name varchar(50), 
    Dept varchar(30),
    Desig varchar(30),
    Basic INT,
    primary key(EmpNewno)
);



Insert into EmpNew(Name,Dept,Desig,Basic) values
('kiran kumar kailasam','java','developer',42233),
('Vishnu Vardhan Reddy','dotnet','programmer',42133),
('Ram Kishan','java','developer',82233),
('Kareem','dotnet','programmer',52234),
('Sheik Sulthan Mohammad','dotnet','developer',42555),
('Vaibhav Singh','java','Manager',82552),
('Rashmi Jadhav','Sql','DBA',42345),
('Smruti','Sql','Expert',88422),
('Vishnu Priya','Sql','Expert',56662);
