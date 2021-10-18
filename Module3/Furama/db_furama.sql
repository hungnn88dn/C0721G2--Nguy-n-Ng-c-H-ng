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

insert into employee (id,`name`,age,cmnd,salary,phone,email,address,office_id,level_id,department_id)
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
value (1,"2019-1-1","2022-1-1",300,10000,3,1,1),
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
--  2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.    
      
select * 
from employee 
where (`name` like "T%" OR  `name` like "H%" OR `name` like "K%") AND length(`name`) <= 15;

--------------------------------------------------------------------------------------------------------------------------------------------------      
-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.

select * 
from customer
where ( 2021 - year(age)) >= 18  AND ( 2021 - year(age)) <= 50 AND ( address like "Quang Tri" OR address like "Da Nang" );


--------------------------------------------------------------------------------------------------------------------------------------------------      
-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

select customer.id, customer.`name`,service.`name` as service, count(service.id) as count, type_customer.`name` as type_customer
from customer join contract on customer.id = contract.customer_id 
join service on contract.service_id = service.id 
join type_customer on customer.type_customer_id = type_customer.id group by customer.`name` having type_customer.`name` = "Diamond" order by count ;


--------------------------------------------------------------------------------------------------------------------------------------------------      
-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc,
--  TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng. 
-- (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select customer.id as id, customer.`name` as `name`, type_customer.`name` as type_customer, 
 contract.id as ContractID, service.`name`, contract.contract_day, contract.end_day as Contract_Endday, (service.rental_cost + ( contract_detail.amount * attachment_service.price)) as Total_Price
from customer left join type_customer on customer.type_customer_id = type_customer.id
left join contract on customer.id = contract.customer_id
left join service on contract.service_id = service.id 
left join contract_detail on contract.id = contract_detail.contract_id
left join attachment_service on contract_detail.attachment_service_id = attachment_service.id 
group by customer.`name`;




--------------------------------------------------------------------------------------------------------------------------------------------------
-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ 
-- chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).

select s.id, s.`name`, s.area, s.rental_cost, t.`name` as Type_Service
from service s left join type_service t on s.type_service_id = t.id
left join contract ct on ct.service_id = s.id
where  ((month(ct.contract_day ) <= 3) AND year (ct.contract_day) <= 2019 ) OR (ct.contract_day is null);


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ đã
--  từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.

select s.id, s.`name`, s.area, s.max_people, s.rental_cost, ts.`name`
from service s  join type_service ts on s.type_service_id = ts.id
join contract c on c.service_id = s.id
where year(c.contract_day) = 2018 AND year(c.contract_day) != 2019;


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên

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
-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 
-- thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

select c.id, month(c.contract_day) as `month` , count(c.service_id) as Count
from contract c where year(c.contract_day) = 2019 group by `month` ;


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
-- (được tính dựa trên việc count các IDHopDongChiTiet).

select  c.id, c.contract_day,c.end_day, c.deposit, sum(cd.amount)
from contract c join contract_detail cd on c.id = cd.contract_id
join attachment_service ats on cd.attachment_service_id = ats.id group by c.id;


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang
--  là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.

select ats.id, c.`name`, tc.`name`, c.address
from customer c join type_customer tc on c.type_customer_id = tc.id
join contract ct on c.id = ct.customer_id
join contract_detail ctd on ct.id = ctd.contract_id
join attachment_service ats on ctd.attachment_service_id = ats.id  having tc.`name` like "diamond" And (c.address like "Quang Ngai" OR c.address like "Vinh");


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết),
--  TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.

select ct.id, e.`name` as employee , c.`name` as customer,c.phone as customer_phone,ts.`name` as type_service, sum(ctd.amount) as Attachment_service_amount, ct.deposit
from customer c join contract ct on ct.customer_id = c.id
join employee e on ct.employee_id = e.id
join service s on ct.service_id = s.id
join type_service ts on s.type_service_id = ts.id
join contract_detail ctd on ct.id = ctd.contract_id
join attachment_service ats on ctd.attachment_service_id = ats.id 
where month(ct.contract_day) >= 9 AND year(ct.contract_day) = 2019  group by c.`name`;


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

select  ats.id, ats.`name`, ctd.amount
from contract ct join contract_detail ctd on ct.id = ctd.contract_id
join attachment_service ats on ctd.attachment_service_id = ats.id where ctd.amount in (select max(ctd.amount) from contract ct join contract_detail ctd on ct.id = ctd.contract_id
join attachment_service ats on ctd.attachment_service_id = ats.id ) 
;


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.

select  ct.id, ts.`name`, ats.`name`, ctd.amount
from contract ct join contract_detail ctd on ct.id = ctd.contract_id
join service s on ct.service_id = s.id
join type_service ts on s.type_service_id = ts.id
join attachment_service ats on ctd.attachment_service_id = ats.id
 where ctd.amount = 1;
 
 
 --------------------------------------------------------------------------------------------------------------------------------------------------
-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, 
-- SoDienThoai, DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.

select e.id, e.`name`, l.`level`, d.`name` 
from contract c join employee e on c.employee_id = e.id
join `level` l on e.level_id = l.id
join department d on e.department_id = d.id  where year(c.contract_day) = 2018 OR year(c.contract_day) = 2019 
group by e.`name` having count(c.employee_id) >= 3 ;

--------------------------------------------------------------------------------------------------------------------------------------------------
-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
-- delete 
-- from employee 
-- where  not exists ( select *  from contract ct  where employee.id = ct.employee_id AND ( year(ct.contract_day) <= 2019 AND year(ct.contract_day) >= 2017) );


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với
--  tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.

create view update_type_customer as 
select c.id,c.`name`, c.type_customer_id
from customer c join type_customer tc  on c.type_customer_id = tc.id
join contract ct on ct.customer_id = c.id where ct.total_price > 10000 AND  year(ct.contract_day) = 2019 AND c.type_customer_id = 4 ;
update update_type_customer
set type_customer_id = 5;


--------------------------------------------------------------------------------------------------------------------------------------------------
-- 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràng buộc giữa các bảng).

-- create view delete_customer as
-- select c.id, c.`name`, ct.contract_day, ct.customer_id, ct.id as contractID
-- from customer c join contract ct on ct.customer_id = c.id 
-- where year(ct.contract_day) < 2016 ;

-- delete from contract 
-- where year(contract.contract_day) < 2016;

-- select * from delete_customer;
-- update delete_customer 
-- set delete_customer.id = 0;
-- drop view delete_customer ;
-- update delete_customer 
-- set id = 0 ;

-- create view delete_customer as
-- select c.id, c.`name`, ct.contract_day
-- from customer c join contract ct on ct.customer_id = c.id 
-- where ct.customer_id is null;

-- -- delete 
-- -- from contract  ct
-- -- where   ct.customer_id is null  ;


---------------------------------------------------------------------------------------------------------------------------------
-- 19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.

create view update_attachment_service as
select ats.id, sum(ctd.amount), ats.price
from contract ct join contract_detail ctd on ctd.contract_id = ct.id
join attachment_service ats on ctd.attachment_service_id = ats.id where year(ct.contract_day) = 2019 group by ats.id having sum(ctd.amount) > 10;

update attachment_service 
set attachment_service.price = attachment_service.price * 2
where attachment_service.id in ( select id from update_attachment_service);


---------------------------------------------------------------------------------------------------------------------------------
-- 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm ID
--  (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
select e.id, e.`name`, e.email, e.phone, e.age, e.address, 0 as `status`
from employee e
union 
select c.id, c.`name`, c.email, c.phone, c.age, c.address, 1 as `status`
from customer c