-- Write q Query as to display head name for JOB as 
	-- Dept CLERK HEAD is 'Naveen'
    -- Dept SALESMAN HEAD is 'Tanya'
    -- Dept MANAGER HEAD is 'Subhra Prakash'
    -- Dept 'ANALYST' HEAD is 'Sanjay'
    -- else HEAD is 'Sireesha'

select Empno, Ename, Sal, Job,
CASE JOB
	WHEN 'CLERK' THEN 'NAVEEN'
    WHEN 'SALESMAN' THEN 'TANYA'
    WHEN 'MANAGER' THEN 'Subhra Prakash'
    WHEN 'ANALYST' THEN 'Sanjay'
    else 'Sireesha'
END 'HeadName'
from Emp;

select empno, ename, job, sal, comm,
CASE WHEN Comm is NULL THEN 0
else comm end 'Updated',
case when comm is null then SAL
else sal+comm end 'TakeHome'
from Emp;

