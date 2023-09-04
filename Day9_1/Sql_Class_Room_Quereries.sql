-- Change database to Infinite_august 

use infinite_august;

-- Show List of tables available in current database 

show tables;

-- Display Info about Emp table 

desc Emp;

-- Display records of Emp table 

select * from Emp;

-- Display Empno, Ename, Job, Sal, Deptno from Emp 

select Empno, Ename, Job, Sal, Deptno
from Emp; -- PROJECT Operator 

-- WHERE Clause : Used to display filtered records 
-- Display info whose empno is 7839

select * from Emp 
where empno=7839;

-- Display info whose sal >= 3000

select * from Emp 
where sal >= 3000;

-- Display info whose job is 'CLERK'

select * from Emp 
where job='CLERK';

-- Display info whose ename is 'ADAMS'

select * from Emp 
where ename='ADAMS';

-- display Info whose employ Hiredate is '1980-12-17' 

select * from Emp 
where hiredate='1980-12-17';

-- Between...AND : used to display info. from startDate to endDate 

select * from Emp 
where sal between 1000 and 3000;

select * from Emp 
where sal NOT between 1000 and 3000;

select * from Emp 
where hiredate between '1980-01-01'  and
'1981-12-12';

select * from Emp 
where hiredate NOT between '1980-01-01'  and
'1981-12-12';

