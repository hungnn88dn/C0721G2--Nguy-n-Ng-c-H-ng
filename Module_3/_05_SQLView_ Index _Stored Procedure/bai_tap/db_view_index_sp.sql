-- Bước 1: Tạo cơ sở dữ liệu demo

drop database if exists demo;
create database demo;
use demo;

--------------------------------------------------------------------------------------------------------------------------------------------------------
-- Bước 2: Tạo bảng Products với các trường dữ liệu sau:

create table product (
id int primary key,
`code` varchar(45),
`name` varchar(45),
price varchar(45),
amount int,
`description` varchar(45),
`status` varchar(45)
);

insert into product (id, `code`, `name`, price,amount,`description`,`status`)
value (1,"Apple-001", "Iphone4",1000,10,"Good",1),
      (2,"Apple-002", "Iphone5",1500,5,"Good",1),
      (3,"Apple-003", "Iphone6",2000,7,"Good",1),
      (4,"Apple-004", "Iphone7",2500,20,"Good",0),
      (5,"Apple-005", "Iphone8",3000,30,"Good",1),
      (6,"Xiaomi-001", "Mi5",1000,10,"Good",1),
      (7,"Xiaomi-002", "Mi6",5000,20,"Good",0),
      (8,"Xiaomi-003", "Mi7",6000,30,"Good",1),
      (9,"Xiaomi-004", "Mi8",7000,40,"Good",1);
      
      
      
--------------------------------------------------------------------------------------------------------------------------------------------------------
-- Bước 3:

--     Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
--     Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
--     Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
--     So sánh câu truy vấn trước và sau khi tạo index

SELECT * FROM product WHERE `code` = "Apple-005";              --  9 row

ALTER TABLE product ADD INDEX idx_product_code(`code`);
EXPLAIN SELECT * FROM product WHERE `code` = "Apple-005" ;     -- 1 row
ALTER TABLE product DROP INDEX idx_product_code;

SELECT * FROM product WHERE `name` = "Iphone6" or price = 2000;  --  9 row
ALTER TABLE product ADD INDEX idx_name_price(`name`, price);
EXPLAIN SELECT * FROM product WHERE `name` = "Iphone6" or price = 2000;
ALTER TABLE product DROP INDEX idx_name_price;


--------------------------------------------------------------------------------------------------------------------------------------------------------

-- Bước 4:

--     Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
--     Tiến hành sửa đổi view
--     Tiến hành xoá view

Create view product_view as
select `code` , `name`, price, status
from product;
select * from product_view;

Create or replace view product_view as
select id, `name`, amount,price
from product where price > 2000;
select * from product_view;

drop view product_view;



--------------------------------------------------------------------------------------------------------------------------------------------------------
-- Bước 5:

--     Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
--     Tạo store procedure thêm một sản phẩm mới
--     Tạo store procedure sửa thông tin sản phẩm theo id
--     Tạo store procedure xoá sản phẩm theo id



--     Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product

delimiter //
Create procedure showAllProduct()
Begin
select * from product;
End //
delimiter ;
call showAllProduct();


--     Tạo store procedure thêm một sản phẩm mới

delimiter //
Create procedure addProduct(id int,
`code` varchar(45),
`name` varchar(45),
price varchar(45),
amount int,
`description` varchar(45),
`status` varchar(45))
Begin
insert into product ( id, `code`, `name`, price, amount, `description`,`status`)
value (id,`code`,`name`,price,amount,`description`,`status`);
End //
delimiter ;
call addProduct(12,"BlackBerry","PP3",3000,30,"Good",1);
drop procedure addProduct;



--     Tạo store procedure sửa thông tin sản phẩm theo id


delimiter //
Create procedure editProduct(id1 int,
`code` varchar(45),
`name` varchar(45),
price varchar(45),
amount int,
`description` varchar(45),
`status` varchar(45))
Begin
update product 
set `code` = `code`, `name` = `name`, price = price, amount = amount, `description` = `description`, `status`= `status`
where id = id1;
End //
delimiter ;
call editProduct(12,"BlackBerry","PassPort Black",4500,30,"Good",1);
drop procedure editProduct;




--     Tạo store procedure xoá sản phẩm theo id

delimiter //
Create procedure deleteProduct(id1 int)
Begin
delete from product 
where id = id1;
End //
delimiter ;
call deleteProduct(5);
drop procedure deleteProduct;
