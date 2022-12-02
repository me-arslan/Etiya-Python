
--1 Tabloya Yeni Veri ekleme ve Düzenleme

Insert into products
(name, unit_price, stock, category_id, product_rating, product_discount_id)
values
('Gözlük Aksesuarı', 235, 250, 9, 4.5, 3)

--2 Update // İlgili veriyi güncelleme

update products
set name = 'Gözlük Askısı' , unit_price = 50 , stock = 35
where id = 13


--3 Delete // Eklenen Veriyi Silme

delete from products
where id = 14 


--4 Sipariş Edilen Ürünlerin Markaları

select b.brand_name,  p.name from products as p
inner join order_products as op
on p.id = op.product_id
inner join brand_categories as bc
on p.category_id = bc.category_id
inner join brands as b
on bc.brand_id = b.id
group by b.brand_name , p.name
order by b.brand_name asc


--5 Sipariş Edilen Ürünlerin Adet Sayılarının Markalara Göre Dağılımı

select b.brand_name, count(*) from products as p
inner join order_products as op
on p.id = op.product_id
inner join brand_categories as bc
on p.category_id = bc.category_id
inner join brands as b
on bc.brand_id = b.id
group by b.brand_name 
order by b.brand_name asc


--6 Markalara Göre Ürünlerin Fiyat Dağılımı

select b.brand_name,  p.name, p.unit_price  from brands as b
inner join brand_categories as bc
on b.id = bc.brand_id
inner join products as p
on bc.category_id = p.category_id
group by b.brand_name,  p.name, p.unit_price 
order by b.brand_name, p.unit_price asc


--7 Aynı Ürünlerin Ortalama Fiyatı

select name, avg(unit_price),count(*) from products
group by name 
order by avg(unit_price)

--8 Raytingi 8 Üzeri Olan Satıcıların Sattığı Ürünler

select s.rating, s.name, p.name, p.unit_price from sellers as s
inner join product_sellers  as ps
on s.id = ps.seller_id
inner join products as p
on ps.product_id =  p.id
where s.rating > 8
order by s.rating


--9 Belirli Lokasyona Satış Yapan Satıcılar

select s.name as "Satıcı Adı", c.city_name as "Satış Lokasyonu" from sellers as s
inner join cities as c
on s.location_id  =  c.id
group by s.name, c.city_name
order by c.city_name


--10 İstanbul'a Satış Yapan Satıcılar


select s.name as "Satıcı Adı", c.city_name as "Satış Lokasyonu" from sellers as s
inner join cities as c
on  s.location_id =  c.id
where c.id = 2
order by s.name


--11 Ankara'ya Satış Yapan Satıcıların Sattığı Ürün Listesi

select c.city_name, s.name, p.name from sellers as s
inner join cities as c
on s.location_id = c.id
inner join product_sellers  as  ps
on s.id = ps.seller_id
inner join products as p
on ps.product_id = p.id
where c.id = 1
order by p.name asc

--12 Teslimatı Sağlanmış Ürünlerin Listesi

select p.name as "Ürün Adı", p.unit_price "Ürün Fiyatı", o.order_status as "Teslimat Durumu"  from order_products as op
inner join orders as o
on o.id = op.order_id
inner join products as p
on p.id = op.product_id
where order_status = 'Teslim Edildi'
order by p.name

--13 İsminde "E" harfi geçen ve İndirim Tanımlanmış Ürünler Listesi

select * from products 
where lower(Name) like '%e%' and product_discount_id is not null

--14 Sepetindeki Ürün Miktarı 100 Liranın Üstündeki Müşterilerin Listesi

select * from baskets as b
inner join customers as c
on c.id = b.customer_id
where b.total_cost > 100 
order by b.total_cost asc

--15 En Fazla Alışveriş Yapan İlk 3 Müşteri

select c.name, c.surname, op.quantity from order_products as op
inner join orders as o
on op.order_id = o.id
inner join customers as c
on o.customer_id = c.id
group by c.name, c.surname, op.quantity 
order by op.quantity desc
limit 3