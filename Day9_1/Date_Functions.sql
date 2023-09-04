-- Date Functions

-- CurDate() : used to display current date 

select curdate();

-- CurTime() : Used to display current time 

select curTime();

-- dayofweek() : Display's day of week

select dayofweek(curdate());

-- dayofmonth() : Displays day of month

select dayofMonth(curdate()); 

-- quarter : Displays quarter no. 

select quarter(curdate());

select adddate(curdate(),INTERVAL 5 day); 

select adddate(curdate(),INTERVAL 5 MONTH); 

select adddate(curdate(),INTERVAL -5 YEAR); 

-- last_day() : Displays the last day of date of month specified

select last_day(curdate());


