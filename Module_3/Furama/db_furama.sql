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
   address varchar(45),
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
 address varchar(45),
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
id int primary key auto_increment,
contract_day date,
end_day date,
deposit int,
total_price int,
employee_id int,
customer_id int,
service_id int,
foreign key (employee_id) references employee(id),
foreign key (customer_id) references customer(id) on delete set null,
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

insert into employee (id,`name`,age,cmnd,salary,phone,email,address,office_id,level_id,department_id)
value (1,"Nguyen Thi Thinh","2000-1-1","11111","1000","0911111111","thinh@gmail.com","Hai Chau-Da Nang",1,1,1),
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
      
insert into customer (id, `name`,age,cmnd,phone,email,address,type_customer_id)
value (1,"Nguyen Van An", "2001-5-5","66666","0900000006","an@gmail.com","Quang Nam",1),
	  (2,"Nguyen Thi Be", "2003-6-6","77777","0900000007","be@gmail.com","Quang Binh",4),
	  (3,"Le Van Cau", "1996-12-7","88888","0900000008","cau@gmail.com","Quang Tri",3),
	  (4,"Sieu Van Do", "1996-8-15","99999","0900000009","do@gmail.com","Hue",4),
	  (5,"Do Dai Hoc", "1999-3-15","00001","0900000000","hoc@gmail.com","Da Nang",5),
	  (6,"Do Dai Hoc", "1999-4-5","00002","0900000011","hoc1@gmail.com","Quang Ngai",5);
      
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
value (1,"2019-12-12","2022-1-1",300,10000,1,1,1),
      (2,"2019-2-15","2022-2-15",300,15000,2,2,2),
      (3,"2019-2-13","2021-6-13",300,1000,2,3,6),
      (4,"2019-10-13","2021-7-13",300,1000,2,3,4),
      (5,"2018-1-1","2021-1-3",300,800,3,6,5),
      (6,"2015-1-1","2021-1-3",300,800,3,4,5);
      
insert into contract_detail ( id, amount,contract_id,attachment_service_id)
value (1,1,1,1),
	  (2,1,2,2),
	  (3,2,3,3),
	  (4,11,4,2),
	  (5,5,5,4);
      

--------------------------------------------------------------------------------------------------------------------------------------------------      
--  2.	Hi???n th??? th??ng tin c???a t???t c??? nh??n vi??n c?? trong h??? th???ng c?? t??n b???t ?????u l?? m???t trong c??c k?? t??? ???H???, ???T??? ho???c ???K??? v?? c?? t???i ??a 15 k?? t???.    
      
select * 
from employee 
where (`name` like "T%" OR  `name` like "H%" OR `name` like "K%") AND length(`name`) <= 15;

--------------------------------------------------------------------------------------------------------------------------------------------------      
-- 3.	Hi???n th??? th??ng tin c???a t???t c??? kh??ch h??ng c?? ????? tu???i t??? 18 ?????n 50 tu???i v?? c?? ?????a ch??? ??? ??????? N???ng??? ho???c ???Qu???ng Tr??????.

select * 
from customer
where ( 2021 - year(age)) >= 18  AND ( 2021 - year(age)) <= 50 AND ( address like "Quang Tri" OR address like "Da Nang" );


--------------------------------------------------------------------------------------------------------------------------------------------------      
-- 4.	?????m xem t????ng ???ng v???i m???i kh??ch h??ng ???? t???ng ?????t ph??ng bao nhi??u l???n.
-- K???t qu??? hi???n th??? ???????c s???p x???p t??ng d???n theo s??? l???n ?????t ph??ng c???a kh??ch h??ng. Ch??? ?????m nh???ng kh??ch h??ng n??o c?? T??n lo???i kh??ch h??ng l?? ???Diamond???.

select customer.id, customer.`name`,service.`name` as service, count(service.id) as count, type_customer.`name` as type_customer
from customer join contract on customer.id = contract.customer_id 
join service on contract.service_id = service.id 
join type_customer on customer.type_customer_id = type_customer.id group by customer.`name` having type_customer.`name` = "Diamond" order by count ;


--------------------------------------------------------------------------------------------------------------------------------------------------      
-- 5.	Hi???n th??? IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc,
--  TongTien (V???i TongTien ???????c t??nh theo c??ng th???c nh?? sau: ChiPhiThue + SoLuong*Gia, v???i SoLuong v?? Gi?? l?? t??? b???ng DichVuDiKem) cho t???t c??? c??c Kh??ch h??ng ???? t???ng ?????t ph???ng. 
-- (Nh???ng Kh??ch h??ng n??o ch??a t???ng ?????t ph??ng c??ng ph???i hi???n th??? ra).

select customer.id as id, customer.`name` as `name`, type_customer.`name` as type_customer, 
 contract.id as ContractID, service.`name`, contract.contract_day, contract.end_day as Contract_Endday, (service.rental_cost + ( contract_detail.amount * attachment_service.price)) as Total_Price
from customer left join type_customer on customer.type_customer_id = type_customer.id
left join contract on customer.id = contract.customer_id
left join service on contract.service_id = service.id 
left join contract_detail on contract.id = contract_detail.contract_id
left join attachment_service on contract_detail.attachment_service_id = attachment_service.id 
group by customer.`name`;




--------------------------------------------------------------------------------------------------------------------------------------------------
-- 6.	Hi???n th??? IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu c???a t???t c??? c??c lo???i D???ch v??? 
-- ch??a t???ng ???????c Kh??ch h??ng th???c hi???n ?????t t??? qu?? 1 c???a n??m 2019 (Qu?? 1 l?? th??ng 1, 2, 3).

select s.id, s.`name`, s.area, s.rental_cost, t.`name` as Type_Service
from service s left join type_service t on s.type_service_id = t.id
left join contract ct on ct.service_id = s.id
where  ((month(ct.contract_day ) <= 3) AND year (ct.contract_day) <= 2019 ) OR (ct.contract_day is null);


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 7.	Hi???n th??? th??ng tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu c???a t???t c??? c??c lo???i d???ch v??? ????
--  t???ng ???????c Kh??ch h??ng ?????t ph??ng trong n??m 2018 nh??ng ch??a t???ng ???????c Kh??ch h??ng ?????t ph??ng  trong n??m 2019.

select s.id, s.`name`, s.area, s.max_people, s.rental_cost, ts.`name`
from service s  join type_service ts on s.type_service_id = ts.id
join contract c on c.service_id = s.id
where year(c.contract_day) = 2018 AND year(c.contract_day) != 2019;


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 8.	Hi???n th??? th??ng tin HoTenKhachHang c?? trong h??? th???ng, v???i y??u c???u HoThenKhachHang kh??ng tr??ng nhau.
-- H???c vi??n s??? d???ng theo 3 c??ch kh??c nhau ????? th???c hi???n y??u c???u tr??n

select c.`name`
from customer c group by c.`name`;

select DISTINCT c.`name`
from customer c ;

select  c.`name`
from customer c 
union
select  c.`name`
from customer c ;


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 9.	Th???c hi???n th???ng k?? doanh thu theo th??ng, ngh??a l?? t????ng ???ng v???i m???i th??ng trong n??m 2019 
-- th?? s??? c?? bao nhi??u kh??ch h??ng th???c hi???n ?????t ph??ng.

select c.id, month(c.contract_day) as `month` , count(c.service_id) as Count
from contract c where year(c.contract_day) = 2019 group by `month` ;


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 10.	Hi???n th??? th??ng tin t????ng ???ng v???i t???ng H???p ?????ng th?? ???? s??? d???ng bao nhi??u D???ch v??? ??i k??m. 
-- K???t qu??? hi???n th??? bao g???m IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
-- (???????c t??nh d???a tr??n vi???c count c??c IDHopDongChiTiet).

select  c.id, c.contract_day,c.end_day, c.deposit, sum(cd.amount)
from contract c join contract_detail cd on c.id = cd.contract_id
join attachment_service ats on cd.attachment_service_id = ats.id group by c.id;


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 11.	Hi???n th??? th??ng tin c??c D???ch v??? ??i k??m ???? ???????c s??? d???ng b???i nh???ng Kh??ch h??ng c?? TenLoaiKhachHang
--  l?? ???Diamond??? v?? c?? ?????a ch??? l?? ???Vinh??? ho???c ???Qu???ng Ng??i???.

select ats.id, c.`name`, tc.`name`, c.address
from customer c join type_customer tc on c.type_customer_id = tc.id
join contract ct on c.id = ct.customer_id
join contract_detail ctd on ct.id = ctd.contract_id
join attachment_service ats on ctd.attachment_service_id = ats.id  having tc.`name` like "diamond" And (c.address like "Quang Ngai" OR c.address like "Vinh");


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 12.	Hi???n th??? th??ng tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (???????c t??nh d???a tr??n t???ng H???p ?????ng chi ti???t),
--  TienDatCoc c???a t???t c??? c??c d???ch v??? ???? t???ng ???????c kh??ch h??ng ?????t v??o 3 th??ng cu???i n??m 2019 nh??ng ch??a t???ng ???????c kh??ch h??ng ?????t v??o 6 th??ng ?????u n??m 2019.

select ct.id, e.`name` as employee , c.`name` as customer,c.phone as customer_phone,ts.`name` as type_service, sum(ctd.amount) as Attachment_service_amount, ct.deposit
from customer c join contract ct on ct.customer_id = c.id
join employee e on ct.employee_id = e.id
join service s on ct.service_id = s.id
join type_service ts on s.type_service_id = ts.id
join contract_detail ctd on ct.id = ctd.contract_id
join attachment_service ats on ctd.attachment_service_id = ats.id 
where month(ct.contract_day) >= 9 AND year(ct.contract_day) = 2019  group by c.`name`;


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 13.	Hi???n th??? th??ng tin c??c D???ch v??? ??i k??m ???????c s??? d???ng nhi???u nh???t b???i c??c Kh??ch h??ng ???? ?????t ph??ng. 
-- (L??u ?? l?? c?? th??? c?? nhi???u d???ch v??? c?? s??? l???n s??? d???ng nhi???u nh?? nhau).

select  ats.id, ats.`name`, ctd.amount
from contract ct join contract_detail ctd on ct.id = ctd.contract_id
join attachment_service ats on ctd.attachment_service_id = ats.id where ctd.amount in (select max(ctd.amount) from contract ct join contract_detail ctd on ct.id = ctd.contract_id
join attachment_service ats on ctd.attachment_service_id = ats.id ) 
;


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 14.	Hi???n th??? th??ng tin t???t c??? c??c D???ch v??? ??i k??m ch??? m???i ???????c s??? d???ng m???t l???n duy nh???t. 
-- Th??ng tin hi???n th??? bao g???m IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.

select  ct.id, ts.`name`, ats.`name`, ctd.amount
from contract ct join contract_detail ctd on ct.id = ctd.contract_id
join service s on ct.service_id = s.id
join type_service ts on s.type_service_id = ts.id
join attachment_service ats on ctd.attachment_service_id = ats.id
 where ctd.amount = 1;
 
 
 --------------------------------------------------------------------------------------------------------------------------------------------------
-- 15.	Hi???n thi th??ng tin c???a t???t c??? nh??n vi??n bao g???m IDNhanVien, HoTen, TrinhDo, TenBoPhan, 
-- SoDienThoai, DiaChi m???i ch??? l???p ???????c t???i ??a 3 h???p ?????ng t??? n??m 2018 ?????n 2019.

select e.id, e.`name`, l.`level`, d.`name` 
from contract c join employee e on c.employee_id = e.id
join `level` l on e.level_id = l.id
join department d on e.department_id = d.id  where year(c.contract_day) = 2018 OR year(c.contract_day) = 2019 
group by e.`name` having count(c.employee_id) >= 3 ;

--------------------------------------------------------------------------------------------------------------------------------------------------
-- 16.	X??a nh???ng Nh??n vi??n ch??a t???ng l???p ???????c h???p ?????ng n??o t??? n??m 2017 ?????n n??m 2019.
-- delete 
-- from employee 
-- where  not exists ( select *  from contract ct  where employee.id = ct.employee_id AND ( year(ct.contract_day) <= 2019 AND year(ct.contract_day) >= 2017) );


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 17.	C???p nh???t th??ng tin nh???ng kh??ch h??ng c?? TenLoaiKhachHang t???  Platinium l??n Diamond, ch??? c???p nh???t nh???ng kh??ch h??ng ???? t???ng ?????t ph??ng v???i
--  t???ng Ti???n thanh to??n trong n??m 2019 l?? l???n h??n 10.000.000 VN??.

create view update_type_customer as 
select c.id,c.`name`, c.type_customer_id
from customer c join type_customer tc  on c.type_customer_id = tc.id
join contract ct on ct.customer_id = c.id where ct.total_price > 10000 AND  year(ct.contract_day) = 2019 AND c.type_customer_id = 4 ;
update update_type_customer
set type_customer_id = 5;


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 18.	X??a nh???ng kh??ch h??ng c?? h???p ?????ng tr?????c n??m 2016 (ch?? ?? r??ng bu???c gi???a c??c b???ng).
delete from customer
where customer.id  in ( select ct.customer_id
				from contract ct
				where year(ct.contract_day) < 2016 );


---------------------------------------------------------------------------------------------------------------------------------
-- 19.	C???p nh???t gi?? cho c??c D???ch v??? ??i k??m ???????c s??? d???ng tr??n 10 l???n trong n??m 2019 l??n g???p ????i.

create view update_attachment_service as
select ats.id, sum(ctd.amount), ats.price
from contract ct join contract_detail ctd on ctd.contract_id = ct.id
join attachment_service ats on ctd.attachment_service_id = ats.id where year(ct.contract_day) = 2019 group by ats.id having sum(ctd.amount) > 10;

update attachment_service 
set attachment_service.price = attachment_service.price * 3
where attachment_service.id in ( select id from update_attachment_service);


---------------------------------------------------------------------------------------------------------------------------------
-- 20.	Hi???n th??? th??ng tin c???a t???t c??? c??c Nh??n vi??n v?? Kh??ch h??ng c?? trong h??? th???ng, th??ng tin hi???n th??? bao g???m ID
--  (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
select e.id, e.`name`, e.email, e.phone, e.age, e.address, 0 as `status`
from employee e
union 
select c.id, c.`name`, c.email, c.phone, c.age, c.address, 1 as `status`
from customer c;


---------------------------------------------------------------------------------------------------------------------------------
-- 21.	T???o khung nh??n c?? t??n l?? V_NHANVIEN ????? l???y ???????c th??ng tin c???a t???t c??? c??c nh??n vi??n c?? ?????a ch??? l?? ???H???i Ch??u??? 
-- v?? ???? t???ng l???p h???p ?????ng  cho 1 ho???c nhi???u Kh??ch h??ng b???t k???  v???i ng??y l???p h???p ?????ng l?? ???12/12/2019???

create view view_employee as
select e.id, e.`name`, e.age,e.cmnd,e.salary,e.phone,e.email,e.address,e.office_id,e.level_id,e.department_id
from employee e join contract ct on ct.employee_id = e.id
where ct.contract_day like "2019-12-12" AND SUBSTRING_INDEX(e.address,'-',1) like "Hai Chau";

select * from view_employee;


---------------------------------------------------------------------------------------------------------------------------------
-- 22.	Th??ng qua khung nh??n V_NHANVIEN th???c hi???n c???p nh???t ?????a ch??? th??nh ???Li??n Chi???u??? ?????i v???i 
-- t???t c??? c??c Nh??n vi??n ???????c nh??n th???y b???i khung nh??n n??y.

update view_employee
set address = concat("Lien Chieu","-",SUBSTRING_INDEX(address,'-',-1));


---------------------------------------------------------------------------------------------------------------------------------
-- 23.	T???o Store procedure Sp_1 D??ng ????? x??a th??ng tin c???a m???t Kh??ch h??ng n??o ???? v???i Id Kh??ch h??ng ???????c
--  truy???n v??o nh?? l?? 1 tham s??? c???a Sp_1


delimiter //
Create procedure deleteCustomer(id1 int)
Begin
delete from  customer 
where id = id1;
End //
delimiter ;
-- call deleteCustomer(1);

---------------------------------------------------------------------------------------------------------------------------------
-- 24.	T???p Store procedure Sp_2 D??ng ????? th??m m???i v??o b???ng HopDong v???i y??u c???u Sp_2 ph???i th???c hi???n ki???m tra
--  t??nh h???p l??? c???a d??? li???u b??? sung, v???i nguy??n t???c kh??ng ???????c tr??ng kh?? ch??nh v?? ?????m b???o to??n v???n tham
--  chi???u ?????n c??c b???ng li??n quan.

delimiter //
Create procedure addContract(contract_day_add date, end_day_add date, deposit_add int, total_price_add int,
 employee_id_add int, customer_id_add int, service_id_add int )
Begin
insert into contract
value (id, contract_day_add, end_day_add, deposit_add, total_price_add, employee_id_add, customer_id_add, 
service_id_add) ;
End //
delimiter ;

-- call addContract("2019-1-1","2019-2-1",1000,2000,2,1,1);


-- ---------------------------------------------------------------------------------------------------------------------------------

-- 25.	T???o triggers c?? t??n Tr_1 X??a b???n ghi trong b???ng HopDong th?? hi???n th??? t???ng s??? l?????ng b???n ghi c??n l???i c?? trong b???ng 
-- HopDong ra giao di???n console c???a database

delimiter //
create trigger show_contract
after delete
on contract for each row
begin 
 
 end //
 delimiter ;
