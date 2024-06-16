# Write your MySQL query statement below
select w1.id
from weather w1
join weather w2
on date_sub(w1.recordDate, interval 1 day) = w2.recordDate
where w1.temperature > w2.temperature;