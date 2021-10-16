drop database if exists furama;
create database Furama;
use furama;


create table office (
id int primary key,
`name` varchar(45)
);

create table `level`(
id int primary key,
`level` varchar(45)
);

create table department(
 id int primary key,
`name` varchar(45)
);

create table employee( 
   id int primary key,
   `name` varchar(45),
   age date,
   cmnd varchar(45),
   salary varchar(45),
   phone varchar(45),
   email varchar(45),
   adress varchar(45),
   office_id int,
   level_id int,
   department_id int,
   foreign key (office_id) references  office(id),
   foreign key (level_id) references `level`(id),
   foreign key (department_id) references department(id)
);

create table type_customer(
 id int primary key,
 `name` varchar(45)
);

create table customer(
 id int primary key,
 `name` varchar(45),
 age date,
 cmnd varchar(45),
 phone varchar(45),
 email varchar(45),
 adress varchar(45),
 type_customer_id int,
 foreign key (type_customer_id) references type_customer(id)
);

create table type_service(
id int primary key,
`name` varchar(45)
);

create table type_rental(
id int primary key,
`name` varchar(45),
price int
);

create table service(
id int primary key,
`name` varchar(45),
area int,
floor int,
max_people varchar(45),
rental_cost varchar(45),
status varchar(45),
type_rental_id int,
type_service_id int,
foreign key (type_rental_id) references type_rental(id),
foreign key ( type_service_id) references type_service(id)
);

create table contract(
id int primary key,
contract_day date,
end_day date,
deposit int,
total_price int,
employee_id int,
customer_id int,
service_id int,
foreign key (employee_id) references employee(id),
foreign key (customer_id) references customer(id),
foreign key (service_id) references service(id)
);

create table attachment_service (
id int primary key,
`name` varchar(45),
price int,
unit int,
`status` varchar(45)
);

create table contract_detail(
id int primary key,
amount int,
contract_id int,
attachment_service_id int,
foreign key (contract_id) references contract(id),
foreign key (attachment_service_id) references attachment_service(id)
);

insert into office (id,`name`)
value ( 1,"Bao Ve"),
      ( 2,"Tiep Tan"),
      ( 3,"Ke Toan"),
      ( 4,"Truong Phong"),
      ( 5,"Giam Doc");
      
insert into `level` (id, `level`)
value ( 1,"12/12"),
      ( 2,"Trung Cap"),
      ( 3,"Cao Dang"),
      ( 4,"Dai Hoc"),
      ( 5,"Thac si");
      
insert into `department` (id, `name`)
value ( 1,"Phong Bao ve"),
      ( 2,"Phong Tiep Tan"),
      ( 3,"Phong Ke Toan"),
      ( 4,"Phong Makerting"),
      ( 5,"Phong Giam Doc");

insert into employee (id,`name`,age,cmnd,salary,phone,email,adress,office_id,level_id,department_id)
value (1,"Nguyen Thi Thinh","2000-1-1","11111","1000","0911111111","thinh@gmail.com","Da Nang",1,1,1),
      (2,"Hoang Van Ha","2002-2-2","22222","2000","0911111112","ha@gmail.com","Hue",2,2,2), 
      (3,"Banh Thi Be Vy","2003-3-13","33333","3000","0911111113","vy@gmail.com","Quang Nam",3,3,3),
      (4,"Le Hong Nhung","1990-5-4","44444","4000","0911111114","nhung@gmail.com","Quang Tri",4,4,4),
      (5,"Ma Van Tai","1990-1-1","55555","6000","0911111115","tai@gmail.com","Quang Ngai",5,5,5);
      
insert into type_customer (id, `name`)
value (1,"Member"),
      (2,"Silver"),
      (3,"Gold"),
      (4,"Platinium"),
      (5,"Diamond");
      
insert into customer (id, `name`,age,cmnd,phone,email,adress,type_customer_id)
value (1,"Nguyen Van An", "2001-5-5","66666","0900000006","an@gmail.com","Quang Nam",1),
	  (2,"Nguyen Thi Be", "2003-6-6","77777","0900000007","be@gmail.com","Quang Binh",2),
	  (3,"Le Van Cau", "1996-12-7","88888","0900000008","cau@gmail.com","Quang Tri",3),
	  (4,"Sieu Van Do", "1996-8-15","99999","0900000009","do@gmail.com","Hue",4),
	  (5,"Do Dai Hoc", "1999-3-15","00001","0900000000","hoc@gmail.com","Da Nang",5);
      
insert into type_service (id, `name`)
value (1,"Villa"),
	  (2,"House"),
	  (3,"Room");
      
insert into type_rental(id, `name`,price)
value (1,"Year",30000),
	  (2,"Year",20000),
	  (3,"Year",10000),
	  (4,"Month",300),
	  (5,"Month",200),
	  (6,"Month",100),
	  (7,"Day",300),
	  (8,"Day",200),
	  (9,"Day",100),
	  (10,"Hour",100),
	  (11,"Hour",50);
      
insert into service( id, `name`,area,floor,max_people,rental_cost,`status`,type_rental_id,type_service_id)
value (1,"SVVL-0001",150,3,"8","10000",1,3,1),
	  (2,"SVVL-0002",200,4,"10","15000",1,2,1),
	  (3,"SVHO-0003",100,3,"6","1000",0,6,2),
	  (4,"SVHO-0004",70,3,"5","800",1,5,2),
	  (5,"SVRO-0005",50,1,"3","300",1,7,3),
	  (6,"SVRO-0001",50,1,"2","200",1,11,3);
      
insert into attachment_service (id, `name`, price,unit,`status`)
value (1,"Massage", 200, 10,"On"),
      (2,"Karaoke", 200, 7,"On"),
      (3,"Food", 50, 100,"On"),
      (4,"Drink", 20, 100,"On"),
      (5,"Tour", 100, 5,"Off");
      
insert into contract(id,contract_day,end_day,deposit,total_price,employee_id,customer_id,service_id)
value (1,"2021-1-1","2022-1-1",300,10000,3,1,1),
      (2,"2021-2-15","2022-2-15",300,15000,2,2,2),
      (3,"2021-5-13","2021-6-13",300,1000,2,3,6),
      (4,"2021-1-1","2021-1-3",300,800,3,4,5);
      
insert into contract_detail ( id, amount,contract_id,attachment_service_id)
value (1,1,1,1),
	  (2,1,2,2),
	  (3,2,3,3),
	  (4,3,4,4);