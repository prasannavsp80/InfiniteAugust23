drop database if exists inventory;

create database inventory;

use inventory;

create table stock
(
	stockid varchar(30) primary key,
	ItemName varchar(30),
	Price numeric(9,2),
	QuantityAvail int
);

insert into Stock(StockId,ItemName,Price,quantityAvail) values('S001','Books',83,22),
('S002','Markers',89,244), ('S003','Bottles',87,53);

Create  table Orders
(
   OrderId varchar(30) primary key,
   StockID varchar(30),
   QtyOrd int,
   billAmount numeric(9,2)
);
   
Create Table Amount
(
  Gamt numeric(9,2)
);

insert into Amount values(0);
