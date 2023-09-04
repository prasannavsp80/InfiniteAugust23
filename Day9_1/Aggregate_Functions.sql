-- Aggregate Functions 

-- sum() : Displays total of the numeric field specified 

select sum(sal) from Emp;

-- max() : Displays max. value of numeric field specified

select max(sal) from Emp; 

-- min() : Displays min. valuue of numeric field specified 

select min(sal) from Emp;

-- avg() : Displays avg salary 

select avg(sal) from Emp;

-- count(*) -> Displays total records of particular table 

select count(*) from Emp;

select count(comm) from Emp;

-- Above command returns as for how many records comm is not null that
-- count will be returned

