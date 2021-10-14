use quan_ly_ban_hang;
insert into customer
value (1,"Minh Quan",10),
      (2, "Ngoc Oanh", 20),
      (3, "Hong Ha",50);
      
insert into `order`
value (1,1,"2006-3-21",null),	
      (2,2,"2006-3-23",null), 
      (3,1,"2006-3-16",null);
      
insert into product
value (1,"May Giat",3),
      (2,"Tu Lanh",5),
      (3,"Dieu Hoa",7),
      (4,"Quat",1),
      (5,"Bep Dien",2);
      
insert into order_detail
value (1,1,3),
       (1,3,7),
       (1,4,2),
       (2,1,1),
       (3,1,8),
       (2,5,4),
       (2,3,3);
       
select id, order_date, total_price
from `order`;

select customer.id as customerID, customer.name, `order`.id as orderID, product.name as productName, order_detail.od_qty as SoLuong
from customer join `order` on customer.id = `order`.customer_id 
join order_detail on `order`.id = order_detail.order_id
join product on order_detail.product_id = product.id;

select customer.id as customerID, customer.name
from customer  left join `order` on customer.id = `order`.customer_id where `order`.id is null;

select customer.id as customerID, customer.name, `order`.id as orderID, product.name as productName, order_detail.od_qty as SoLuong,product.price as Gia, order_detail.od_qty * product.price as total
from customer join `order` on customer.id = `order`.customer_id 
join order_detail on `order`.id = order_detail.order_id
join product on order_detail.product_id = product.id;


      


