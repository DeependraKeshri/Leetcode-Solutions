# Write your MySQL query statement below
select name from salesperson where sales_id not in(select sales_id from company as c inner join orders as o on c.com_id=o.com_id where c.name="red");