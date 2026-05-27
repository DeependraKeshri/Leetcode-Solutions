# Write your MySQL query statement below
select d1.id from Weather as d1 join Weather as d2 on datediff(d1.recordDate,d2.recordDate)=1 where d1.temperature>d2.temperature;