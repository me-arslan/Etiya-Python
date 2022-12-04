-- 1 - Kargo şirketlerine toplam kaç para ödendiğini hesaplayınız?
select sum(sh.cost)from shipments sh
	
-- 2 - Halihazırda indirimli ve isminde 'b' geçen tüm ürünleri listeleyiniz.
select * from products p
	where p.name like('%b%')and p.product_discount_id is not null
	
-- 3 - Harfi c olan tüm ürünleri listeleyiniz.
select * from products p
	where p.name like('__c%')
	
-- 4 - Bir kişinin sipariş oluştururken kullanacağı insert komutlarını yazınız. 
--(alt tablolar dahil ve siparişte en az 3 ürün olacak şekilde)

--eklediğimiz siparişin detayları
--(Costomer_id=1 ürünler-->p.id=7 2420,10=4950 4=18990,total_cost 26.360)

insert into orders (customer_id,total_cost,payment_id,shipment_address_id, invoice_address_id,order_date,order_status)
			values(1,26360,9,1,1,'2022-12-04','Kargoda')
			
-- order tablsunda sipariş oluşturduktan sonra aynı id altına 3 farklı ürün eklenilmesi
--(order id=7)
insert into order_products(product_id,order_id,quantity,total_price)
			values(7,7,1,2420)
insert into order_products(product_id,order_id,quantity,total_price)
			values(10,7,1,4950)
insert into order_products(product_id,order_id,quantity,total_price)
			values(4,7,1,18990)


-- 5 - Sipariş Veren Kullanıcının Alışveriş Sepetini Temizleme
-- Örnekleme CustomerID'si 1 olan kullanıcının sipariş vermesi üzerinden verilmiştir.

do
$$
begin
If exists (select * from orders as o where o.customer_id = 1 and o.id is not null) 
then
	delete from baskets where customer_id = 1;
end if;
end;
$$


-- 6 - Ürünleri İndirim Oranınları Uygulanmış Şekilde Listeleme 
select * from product_discounts
select p.id,p.name as "Ürün Adı",p.unit_price as "Ürün Fiyatı", pd.discount_value as "İndirim Oranı", (p.unit_price / 100 * (100 - pd.discount_value)) as "İndirimli Fiyatı"
from products as p inner join product_discounts as pd on pd.id = p.product_discount_id
group by p.id , pd.discount_value
order by p.name asc;

select * from products


-- 7 - Customer Review Yaptığında Oluşacak Insert Komutu Geliştirme
-- Örnekleme CustomerID'si 1 olan kullanıcının, ID'si 2 olan ürüne puanlama ve yorum yapması üzerinden verilmiştir.

-- Aktif db üzerinde bir UserReviews tablosu olmadığı için önce onu oluşturuyoruz

CREATE TABLE IF NOT EXISTS public.user_reviews
(
    id int not null GENERATED ALWAYS AS IDENTITY,
    customer_id int not null,
    product_id int not null,
    score int not null check(score between 1 and 5), --  Maksimum puanı 5 ile sınırlama
    usercomments varchar,
    PRIMARY KEY (id),
	FOREIGN KEY (customer_id) REFERENCES public.customers (id) MATCH SIMPLE,
	FOREIGN KEY (product_id) REFERENCES public.products (id) MATCH SIMPLE
);

insert into user_reviews as ur (customer_id, product_id, score, usercomments)
values (1, 2, 5, 'Harika Ürün! Tavsiye Ederim');

-- 8 - Customer Refund Ettiğinde Oluşacak Insert Komutu
-- Örnekleme CustomerID'si 1 olan kullanıcının, Order ID'si 5 olan ürünü iade etmesi üzerinden verilmiştir.

insert into refunds as r (customer_id, order_id,total_redund_price,refund_reason)
values  (1, 5, 50, 'Bedeni Küçük');

-- 9 - İade durumları değiştiğinde oluşacak update komutunu geliştiriniz.
--Refund id si 1 olan İadenin , iade nedenini değiştirme.

update refunds
set refund_reason = 'Kalitesiz' 
where id = 1

-- 10 - Satıcı ürünü güncellemek istediğinde oluşacak örnek bir update komutu geliştiriniz.
-- product id'si 7 olan ürünün bilgilerini güncelleme.

update products
set name = 'Çelik Halka Küpe' , unit_price = 25 , stock = 70, product_rating = 2.5, product_discount_id = 1
where id = 7

-- 11 - Sipariş durumu (kargoda,taşımada vs) değiştiğinde tabloda değişikliği yapacak update komutunu geliştiriniz.
-- Orders id si 5 olan siparişin sipariş durumunu güncelleme.

update orders
set order_status = 'Taşımada'
where id = 5

-- 12 - Kullanıcı sepete ürün eklediğinde oluşacak insert komutunu geliştiriniz.

-- Örnekleme Product ID'si 4 olan producttan bir adet daha eklediğinde oluşacak update komutu
-- Basket_products tablosunda Quantity olmadığı için önce tabloya ekleme yapıyoruz.

alter table basket_products
add quantity smallint 

select * from basket_products inner join baskets on basket_products.basket_id=baskets.id;
update basket_products
set quantity = quantity + 1
where product_id = 4

-- 13 - Kullanıcı sepetteki ürün adetini artırdığında oluşacak komutu geliştiriniz.

select * from basket_products 
	inner join baskets on basket_products.basket_id=baskets.id;
	insert into basket_products (basket_id,product_id, quantity)
	values (5, 6, +1)	

-- 14 - En az bir sipariş vermiş ancak hiç "MNG Kargo" kullanmamış müşterileri listeleyiniz

select customers.name,customers.surname,shipment_brands.shipment_brand_name from customers
inner join orders on customers.id = orders.customer_id
inner join order_shipments on orders.id=order_shipments.order_id
inner join shipments on shipments.id = order_shipments.shipment_id
inner join shipment_brands on shipments.shipment_brand_id = shipment_brands.id
where shipment_brand_name <> 'MNG Kargo'

-- 15 - En az bir adet aynı üründen 10+ sipariş vermiş kullanıcılar

select c.name as "müsteri_adi",c.surname as "müsteri_soyadi",p.name as "ürün_adi", op.quantity as "Sipariş Adeti" from customers c
inner join orders o
on o.customer_id = c.id
inner join order_products op
on op.order_id = o.id
inner join products p
on p.id = op.product_id
where op.quantity > 10

-- 16 - Onaylanmamış ödemeleri listeleyiniz.

-- Payments tablosunda status durumu olmadığı için önce ekleme yapıyoruz.
alter table payments
add status bool

select * from orders
inner join payments on payments.id = orders.payment_id
where payments.status = true

--17 - En az 2 farklı ülkede adresi olan kullanıcıları listeleyiniz.

select c.name, c.surname from addresses ad
inner join customers c
on c.id = ad.customer_id
inner join districts d
on ad.district_id = d.id
inner join cities ci
on d.city_id = ci.id
inner join countries co 
on ci.country_id = co.id
group by c.name, c.surname 
having count (ad.customer_id) > 1

-- 18 - En az 2 farklı ülkede adresi olan kullanıcıları listeleyiniz.

select customers.id,customers.name,customers.surname,countries.country_name from customers
inner join addresses on customers.id = addresses.customer_id
inner join districts on districts.id = addresses.district_id
inner join cities on cities.id = districts.city_id
inner join countries on countries.id = cities.country_id
group by customers.id, customers.name, customers.surname, countries.country_name
having count (distinct countries.country_name) > 1


-- 19 - Eklenmiş ancak hiç bir siparişte kullanılmamış adresleri listeleyiniz.

select * from addresses 
left join orders on orders.shipment_address_id = addresses.id
where orders.shipment_address_id is null

select * from addresses		
select * from orders		
		
		
		
		

