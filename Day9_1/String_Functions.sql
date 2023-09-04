-- String Functions 

-- instr() : used to display first occurrence of given char in a string 

select instr('Jitendra','e');

select ename, instr(ename,'A') from Emp;

-- Length() : Displays the length of given string 

select length('Aniruth');

select ename, length(ename) from Emp;

-- Reverse : Displays string in reverse order 

select reverse('Yukesh');

select Ename, Reverse(Ename) from Emp;

-- Lower() : used to display in lower case 
-- Upper() : used to display in upper case 

select lower('Adams'), upper('RajKishore');

select ename, lower(ename), upper(ename) from Emp;

-- LEFT() : Display's no. of left-side chars 

select left('Sanjay',4);

-- Right() : Displays no.of right-side chars 

select right('Rajesh',4);

-- Concat : Used to concatenate multiple strings 

select concat('Aniruth',' ','Mehta');

-- Replace : used to replace old string/char with new string/char 
-- in all occurrences

select replace('Java Training','Java','Sql');

