drop database if exists collegeinfinte;

create database collegeinfinte;

use collegeinfinte;

create table CourseList
(
   courseno varchar(15) primary key,
   duration int,
   startDate Date,
   endDate Date,
   HOD varchar(30)
);


create table subjects
(
   subjectId INT primary key,
   year int,instructor varchar(28),
subject varchar(150),
theory int,
practical int
);

create table Feedback
(
   FID varchar(30) primary key,
   StudentName varchar(30),
   instructor varchar(30),
   subject varchar(30),
   FbValue varchar(20)
);