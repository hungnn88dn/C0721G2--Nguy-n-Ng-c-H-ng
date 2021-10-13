create database bai_tap_2;
use bai_tap_2;
create table customer (
id int primary key,
`name` varchar(45),
age int
);

create table `order` (
 id int primary key,
 customer_id int,
 order_date date,
 total_price long,
 
foreign key (customer_id) references customer(id)
);

create table product(
id int primary key,
`name` varchar(45),
price long
);

create table order_detail(
order_id int,
product_id int,
od_qty int,

primary key ( order_id, product_id),
foreign key ( order_id) references `order`(id),
foreign key (product_id) references product(id)
);
