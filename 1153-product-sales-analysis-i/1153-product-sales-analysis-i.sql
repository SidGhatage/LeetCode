# Write your MySQL query statement below
-- select product.product_name, sales.year, sales.price
-- from sales
-- left join product
-- on sales.product_id = product.product_id;

select P.product_name, S.year, S.price
from sales S
join product P
on S.product_id = P.product_id;