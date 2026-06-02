/*Write a solution to find the sum of amounts for odd and even transactions for each day. If there are no odd or even transactions for a specific date, display as 0.

Return the result table ordered by transaction_date in ascending order.*/


select  transaction_date , sum(case when amount%2=1 then amount else 0 end) as odd_sum, sum(case when amount%2=0 then amount else 0 end) as even_sum from transactions group by transaction_date order by transaction_date;


/*
Write a solution to find all customers who never order anything.

Return the result table in any order.*/




# Write your MySQL query statement below

select c.name as Customers from Customers  c left join Orders o on c.id=o.customerId where o.customerId Is Null; 