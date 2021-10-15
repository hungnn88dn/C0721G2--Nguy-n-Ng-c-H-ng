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
total_pric int,
employee_id int,
customer_id int,
service_id int,
foreign key (employee_id) references employee(id),
foreign key (customer_id) references customer(id),
foreign key (service_id) references service(id)
);

create table attachment_service (
id int primary key,
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

