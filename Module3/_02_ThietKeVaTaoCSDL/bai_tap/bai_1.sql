
create database bai_tap_1;
use bai_tap_1;

create table phieuxuat (
  id INT primary key,
  export_day date
);

create table vattu(
id INT primary key, 
`name` varchar(45)
);

create table phieunhap (
 id INT primary key,
 import_day date
);


create table type_of_phone_number(
id int primary key,
phone_number int
);

create table nhacc(
id INT primary key,
`name` varchar(45),
address varchar(90),
phone_number INT,
type_of_phone_number_id int,
foreign key (type_of_phone_number_id) references type_of_phone_number(id)
);

create table dondh(
id INT primary key,
order_day date,
nhacc_id int,
foreign key(nhacc_id) references nhacc(id)
);

create table phieuxuat_vattu (
    phieuxuat_id int,
    vattu_id int,
    dg_xuat int,
    sl_xuat int,
    
    primary key (phieuxuat_id,vattu_id),
    foreign key ( phieuxuat_id) references phieuxuat(id),
    foreign key (vattu_id) references vattu(id)
);

create table phieunhap_vattu (
 phieunhap_id int,
 vattu_id int, 
 dg_nhap int,
 sl_nhap int,
 
 primary key (phieunhap_id, vattu_id), 
 foreign key (phieunhap_id) references phieunhap(id),
 foreign key ( vattu_id) references vattu(id)
);

create table dondh_vattu(
dondh_id int,
vattu_id int,
primary key (dondh_id, vattu_id),
foreign key ( dondh_id) references dondh(id),
foreign key ( vattu_id) references vattu(id)
);



 
