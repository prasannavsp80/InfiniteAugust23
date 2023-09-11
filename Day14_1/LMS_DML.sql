use lms;

Insert into Employee(EmpId,EmpName,EmpEmail,MobileNo,DateOfJion,ManagerId,LeaveAvail)
values(1000,'Sagar','sagar@gmail.com','847273444','2023-10-08',null,12),
(1001,'Abhishek','abhi225@gmail.com','884823455','2023-09-09',1000,12),
(1002,'Kaushik','kaushik@gmail.com','90042344','2023-01-01',1000,15),
(1003,'Prakash','subhra@gmail.com','90442442','2023-07-07',1001,14),
(1004,'Harsh','Harsh@gmail.com','908482234','2023-07-09',1001,15),
(1005,'Shivangi','shivangi@gmail.com','904234422','2023-10-11',1002,12),
(1006,'Rajesh','rajesh@gmail.com','904244552','2022-09-09',1002,12);


Insert into LeaveDetails(EmpId,LeaveStartDate,LeaveEndDate,leaveType,leaveReason)
values(1000,'2023-10-10','2023-10-10','EL','going home'),
(1005,'2023-12-12','2023-10-10','EL','Function'),
(1006,'2023-12-25','2023-12-31','PL','My Marriage'),
(1003,'2023-12-12','2023-10-10','EL','Function'),
(1004,'2023-12-25','2023-12-31','PL','Personal'),
(1003,'2023-10-10','2023-10-10','EL','Function'),
(1004,'2023-10-10','2023-12-31','PL','Personal');


select * from LeaveDetails;
